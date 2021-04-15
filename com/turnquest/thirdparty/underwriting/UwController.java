// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting;

import org.springframework.http.HttpStatus;
import com.turnquest.thirdparty.underwriting.policy.PaymentConfirmationResponse;
import org.springframework.http.ResponseEntity;
import com.turnquest.thirdparty.underwriting.policy.PaymentConfirmationRequest;
import com.turnquest.thirdparty.underwriting.policy.CertificateResponse;
import com.turnquest.thirdparty.underwriting.policy.CertificateRequest;
import com.turnquest.thirdparty.underwriting.policy.AmlResponse;
import com.turnquest.thirdparty.underwriting.policy.AmlInfo;
import org.springframework.web.bind.annotation.RequestMethod;
import com.turnquest.thirdparty.underwriting.dto.BrkResponseDTO;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import com.turnquest.thirdparty.underwriting.policy.UwResponse;
import org.springframework.web.bind.annotation.RequestBody;
import com.turnquest.thirdparty.underwriting.policy.PolicyInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/api/underwriting/" })
public class UwController
{
    final UwService uwService;
    
    @PostMapping({ "postUWTransactions" })
    UwResponse postUWTransactions(@RequestBody final PolicyInfo policyInfo) {
        return this.uwService.postUWTransactions(policyInfo);
    }
    
    @RequestMapping(value = { "/updateUwStatus" }, method = { RequestMethod.POST }, consumes = { "application/json" })
    public BrkResponseDTO updateUwStatus(@RequestBody final List<BrkResponseDTO> uwResponses) {
        return this.uwService.updateUwStatus((List)uwResponses);
    }
    
    @PostMapping({ "postAmlDetails" })
    AmlResponse postAmlTransactions(@RequestBody final AmlInfo amlInfo) {
        return this.uwService.postAmlTransactions(amlInfo);
    }
    
    @PostMapping({ "issueCertificate" })
    CertificateResponse issueAkiCertificate(@RequestBody final CertificateRequest certificateRequest) {
        return this.uwService.issueAkiCertificate(certificateRequest);
    }
    
    @PostMapping({ "checkPaymentTransactions" })
    ResponseEntity<List<PaymentConfirmationResponse>> checkPaymentTransactions(@RequestBody final PaymentConfirmationRequest paymentConfirmationRequest) {
        final List<PaymentConfirmationResponse> response = (List<PaymentConfirmationResponse>)this.uwService.checkPaymentTransactions(paymentConfirmationRequest);
        try {
            return (ResponseEntity<List<PaymentConfirmationResponse>>)new ResponseEntity((Object)response, HttpStatus.OK);
        }
        catch (Exception e) {
            e.printStackTrace();
            return (ResponseEntity<List<PaymentConfirmationResponse>>)new ResponseEntity((Object)response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    public UwController(final UwService uwService) {
        this.uwService = uwService;
    }
}
