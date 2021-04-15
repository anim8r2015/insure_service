// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.customer;

import com.turnquest.thirdparty.customer.models.DefaultedFacilityStatusCheck;
import com.turnquest.thirdparty.customer.models.DefaultedFacilityPaymentInfo;
import com.turnquest.thirdparty.customer.models.DefaultedFacility;
import com.turnquest.thirdparty.customer.models.ClearedFacility;
import com.turnquest.thirdparty.customer.models.Disbursement;
import org.springframework.web.bind.annotation.PostMapping;
import com.turnquest.thirdparty.customer.models.Message;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import com.turnquest.thirdparty.customer.models.CustomerModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({ "/api/customer" })
public class CustomerController
{
    private final CustomerService bloomService;
    
    @PostMapping({ "/optIn" })
    public DeferredResult<Message> saveLead(@Valid @RequestBody final CustomerModel customerModel) {
        final DeferredResult<Message> deferredResult = (DeferredResult<Message>)new DeferredResult();
        final DeferredResult deferredResult2;
        this.bloomService.customerOptIn(customerModel).whenComplete((res, ex) -> {
            if (ex != null) {
                deferredResult2.setErrorResult((Object)ex.getCause());
            }
            deferredResult2.setResult((Object)res);
            return;
        });
        return deferredResult;
    }
    
    @PostMapping({ "/disbursement" })
    public DeferredResult<Disbursement> saveDisbursement(@Valid @RequestBody final Disbursement disbursement) {
        final DeferredResult<Disbursement> deferredResult = (DeferredResult<Disbursement>)new DeferredResult();
        final DeferredResult deferredResult2;
        this.bloomService.disbursement(disbursement).whenComplete((res, ex) -> {
            if (ex != null) {
                deferredResult2.setErrorResult((Object)ex.getCause());
            }
            deferredResult2.setResult((Object)res);
            return;
        });
        return deferredResult;
    }
    
    @PostMapping({ "/clearedFacility" })
    public DeferredResult<ClearedFacility> saveClearedFacility(@Valid @RequestBody final ClearedFacility clearedFacility) {
        final DeferredResult<ClearedFacility> deferredResult = (DeferredResult<ClearedFacility>)new DeferredResult();
        final DeferredResult deferredResult2;
        this.bloomService.saveClearedFacility(clearedFacility).whenComplete((res, ex) -> {
            if (ex != null) {
                deferredResult2.setErrorResult((Object)ex.getCause());
            }
            deferredResult2.setResult((Object)res);
            return;
        });
        return deferredResult;
    }
    
    @PostMapping({ "/defaultedFacility" })
    public DeferredResult<DefaultedFacility> saveDefaultedFacility(@Valid @RequestBody final DefaultedFacility defaultedFacility) {
        final DeferredResult<DefaultedFacility> deferredResult = (DeferredResult<DefaultedFacility>)new DeferredResult();
        final DeferredResult deferredResult2;
        this.bloomService.saveDefaultedFacility(defaultedFacility).whenComplete((res, ex) -> {
            if (ex != null) {
                deferredResult2.setErrorResult((Object)ex.getCause());
            }
            deferredResult2.setResult((Object)res);
            return;
        });
        return deferredResult;
    }
    
    @PostMapping({ "/defaultedFacilityPaymentInfo" })
    public DeferredResult<DefaultedFacilityPaymentInfo> saveDefaultedFacilityPaymentIno(@Valid @RequestBody final DefaultedFacilityPaymentInfo defaultedFacilityPaymentInfo) {
        final DeferredResult<DefaultedFacilityPaymentInfo> deferredResult = (DeferredResult<DefaultedFacilityPaymentInfo>)new DeferredResult();
        final DeferredResult deferredResult2;
        this.bloomService.saveDefaultedFacilityPaymentInfo(defaultedFacilityPaymentInfo).whenComplete((res, ex) -> {
            if (ex != null) {
                deferredResult2.setErrorResult((Object)ex.getCause());
            }
            deferredResult2.setResult((Object)res);
            return;
        });
        return deferredResult;
    }
    
    @PostMapping({ "/defaultedFacilityStatusCheck" })
    public DeferredResult<DefaultedFacilityStatusCheck> getDefaultedFacilityStatusCheck(@Valid @RequestBody final DefaultedFacilityStatusCheck defaultedFacilityStatusCheck) {
        final DeferredResult<DefaultedFacilityStatusCheck> deferredResult = (DeferredResult<DefaultedFacilityStatusCheck>)new DeferredResult();
        final DeferredResult deferredResult2;
        this.bloomService.getDefaultedFacilityStatusCheck(defaultedFacilityStatusCheck).whenComplete((res, ex) -> {
            if (ex != null) {
                deferredResult2.setErrorResult((Object)ex.getCause());
            }
            deferredResult2.setResult((Object)res);
            return;
        });
        return deferredResult;
    }
    
    public CustomerController(final CustomerService bloomService) {
        this.bloomService = bloomService;
    }
}
