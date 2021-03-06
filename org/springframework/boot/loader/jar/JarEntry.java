// 
// Decompiled by Procyon v0.5.36
// 

package org.springframework.boot.loader.jar;

import java.io.IOException;
import java.util.jar.Manifest;
import java.util.jar.Attributes;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.CodeSigner;
import java.security.cert.Certificate;

class JarEntry extends java.util.jar.JarEntry implements FileHeader
{
    private Certificate[] certificates;
    private CodeSigner[] codeSigners;
    private final JarFile jarFile;
    private long localHeaderOffset;
    
    JarEntry(final JarFile jarFile, final CentralDirectoryFileHeader header) {
        super(header.getName().toString());
        this.jarFile = jarFile;
        this.localHeaderOffset = header.getLocalHeaderOffset();
        this.setCompressedSize(header.getCompressedSize());
        this.setMethod(header.getMethod());
        this.setCrc(header.getCrc());
        this.setSize(header.getSize());
        this.setExtra(header.getExtra());
        this.setComment(header.getComment().toString());
        this.setSize(header.getSize());
        this.setTime(header.getTime());
    }
    
    @Override
    public boolean hasName(final String name, final String suffix) {
        return this.getName().length() == name.length() + suffix.length() && this.getName().startsWith(name) && this.getName().endsWith(suffix);
    }
    
    URL getUrl() throws MalformedURLException {
        return new URL(this.jarFile.getUrl(), this.getName());
    }
    
    @Override
    public Attributes getAttributes() throws IOException {
        final Manifest manifest = this.jarFile.getManifest();
        return (manifest != null) ? manifest.getAttributes(this.getName()) : null;
    }
    
    @Override
    public Certificate[] getCertificates() {
        if (this.jarFile.isSigned() && this.certificates == null) {
            this.jarFile.setupEntryCertificates(this);
        }
        return this.certificates;
    }
    
    @Override
    public CodeSigner[] getCodeSigners() {
        if (this.jarFile.isSigned() && this.codeSigners == null) {
            this.jarFile.setupEntryCertificates(this);
        }
        return this.codeSigners;
    }
    
    void setCertificates(final java.util.jar.JarEntry entry) {
        this.certificates = entry.getCertificates();
        this.codeSigners = entry.getCodeSigners();
    }
    
    @Override
    public long getLocalHeaderOffset() {
        return this.localHeaderOffset;
    }
}
