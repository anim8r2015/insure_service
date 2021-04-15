// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting;

import com.turnquest.thirdparty.underwriting.policy.PaymentConfirmationResponse;
import com.turnquest.thirdparty.underwriting.policy.PaymentConfirmationRequest;
import com.turnquest.thirdparty.underwriting.policy.CertificateInfo;
import com.turnquest.thirdparty.underwriting.policy.CertificateResponse;
import com.turnquest.thirdparty.underwriting.policy.CertificateRequest;
import com.turnquest.thirdparty.underwriting.policy.AmlResponse;
import com.turnquest.thirdparty.underwriting.policy.AmlInfo;
import com.turnquest.thirdparty.underwriting.dto.BrkResponseDTO;
import java.util.List;
import com.turnquest.thirdparty.underwriting.policy.UwResponse;
import com.turnquest.thirdparty.underwriting.policy.PolicyInfo;

public interface UwService
{
    UwResponse postUWTransactions(final PolicyInfo p0);
    
    String updateStatus(final UwResponse p0);
    
    BrkResponseDTO updateUwStatus(final List<BrkResponseDTO> p0);
    
    AmlResponse postAmlTransactions(final AmlInfo p0);
    
    CertificateResponse issueAkiCertificate(final CertificateRequest p0);
    
    CertificateResponse certAllocation(final CertificateInfo p0);
    
    String replaceNullValues(final String p0);
    
    String authenticateAkiApis();
    
    List<PaymentConfirmationResponse> checkPaymentTransactions(final PaymentConfirmationRequest p0);
}
