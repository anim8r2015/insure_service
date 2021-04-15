// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting.dto;

import java.util.List;
import java.io.Serializable;

public class BrkResponseDTOWrapper implements Serializable
{
    private List<BrkResponseDTO> brkResponseDTOWrapper;
    
    public List<BrkResponseDTO> getBrkResponseDTOWrapper() {
        return this.brkResponseDTOWrapper;
    }
    
    public void setBrkResponseDTOWrapper(final List<BrkResponseDTO> brkResponseDTOWrapper) {
        this.brkResponseDTOWrapper = brkResponseDTOWrapper;
    }
    
    @Override
    public String toString() {
        return "BrkResponseDTOWrapper: " + this.brkResponseDTOWrapper.toString();
    }
}
