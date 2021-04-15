// 
// Decompiled by Procyon v0.5.36
// 

package com.turnquest.thirdparty.underwriting;

import org.slf4j.LoggerFactory;
import com.turnquest.thirdparty.underwriting.policy.PaymentConfirmationResponse;
import com.turnquest.thirdparty.underwriting.policy.PaymentConfirmationRequest;
import java.text.DateFormat;
import java.util.TimeZone;
import com.turnkeyafrica.dmvic.certtypes.typed.response.IssuanceTypeDResponse;
import com.turnkeyafrica.dmvic.certtypes.typec.response.IssuanceTypeCResponse;
import com.turnkeyafrica.dmvic.certtypes.typeb.response.IssuanceTypeBResponse;
import com.turnkeyafrica.dmvic.certtypes.typea.response.IssueCertificate;
import com.turnkeyafrica.dmvic.certtypes.typea.response.IssuanceTypeAResponse;
import com.turnkeyafrica.dmvic.certtypes.typed.request.IssuanceTypeDRequest;
import com.turnkeyafrica.dmvic.certtypes.typec.request.IssuanceTypeCRequest;
import com.turnkeyafrica.dmvic.certtypes.typeb.request.IssuanceTypeBRequest;
import com.turnkeyafrica.dmvic.certtypes.AkiError;
import com.turnkeyafrica.dmvic.certtypes.typea.request.IssuanceTypeARequest;
import java.util.HashMap;
import java.sql.PreparedStatement;
import com.turnquest.thirdparty.underwriting.policy.CertificateInfo;
import com.turnquest.thirdparty.underwriting.policy.CertificateResponse;
import com.turnquest.thirdparty.underwriting.policy.CertificateRequest;
import com.turnquest.thirdparty.underwriting.entities.AgencyAmlInfo;
import com.turnquest.thirdparty.underwriting.policy.AmlResponse;
import com.turnquest.thirdparty.underwriting.policy.AmlInfo;
import com.mashape.unirest.http.Unirest;
import com.turnquest.thirdparty.underwriting.dto.RptParametersDTO;
import com.turnquest.thirdparty.underwriting.dto.RptParametersDTOWrapper;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileOutputStream;
import java.io.File;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.http.HttpHeaders;
import com.turnquest.thirdparty.underwriting.dto.BrkResponseDTO;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import com.turnquest.thirdparty.underwriting.entities.InsPolicyInfo;
import java.sql.CallableStatement;
import java.sql.Connection;
import com.turnquest.thirdparty.underwriting.policy.MotorInfo;
import java.util.Iterator;
import com.turnquest.thirdparty.underwriting.policy.ClientInfo;
import java.util.Random;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.commons.dbutils.DbUtils;
import com.turnquest.thirdparty.utils.BeanUtil;
import com.turnquest.thirdparty.underwriting.entities.AgencyInsuredLimitsInfo;
import com.turnquest.thirdparty.underwriting.policy.RiskSection;
import com.turnquest.thirdparty.underwriting.entities.AgencyMotorSchInfo;
import com.turnquest.thirdparty.underwriting.policy.RiskAdditionalInfo;
import com.turnquest.thirdparty.underwriting.exceptions.ApiException;
import com.turnquest.thirdparty.underwriting.services.JsonTreeIterator;
import com.turnquest.thirdparty.underwriting.entities.AgencyRiskInfo;
import com.turnquest.thirdparty.underwriting.policy.RiskInfo;
import com.turnquest.thirdparty.setups.GlobalCC;
import sun.misc.BASE64Decoder;
import com.turnquest.thirdparty.underwriting.entities.AgencyDocumentInfo;
import com.turnquest.thirdparty.underwriting.policy.Documents;
import java.sql.Date;
import java.text.SimpleDateFormat;
import com.turnquest.thirdparty.underwriting.entities.AgencyClientInfo;
import com.turnquest.thirdparty.underwriting.entities.AgencyPolicyInfo;
import com.turnquest.thirdparty.underwriting.policy.UwResponse;
import com.turnquest.thirdparty.underwriting.policy.PolicyInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.turnquest.thirdparty.underwriting.repositories.AmlRepository;
import com.turnquest.thirdparty.underwriting.repositories.MasterRiskDtlRepository;
import com.turnquest.thirdparty.underwriting.repositories.DocumentRepository;
import com.turnquest.thirdparty.underwriting.repositories.InsuredLimitsRepository;
import com.turnquest.thirdparty.underwriting.repositories.ClientRepository;
import com.turnquest.thirdparty.underwriting.repositories.RiskRepository;
import com.turnquest.thirdparty.underwriting.repositories.PolicyRepository;
import org.springframework.web.client.RestTemplate;
import com.turnquest.thirdparty.underwriting.repositories.MotorSchRepository;
import com.turnquest.thirdparty.underwriting.repositories.InsPolicyInfoRepository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.turnkeyafrica.dmvic.auth.LoginRequest;
import com.turnkeyafrica.dmvic.auth.LoginResponse;
import com.turnkeyafrica.dmvic.AuthenticationService;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class UwServiceImpl implements UwService
{
    private static final Logger log;
    private static AuthenticationService service;
    private static LoginResponse loginResponse;
    private LoginRequest request;
    @Autowired
    private final JdbcTemplate jdbcTemplate2;
    @Autowired
    private final NamedParameterJdbcTemplate jdbcTemplate;
    @Autowired
    private InsPolicyInfoRepository insPolicyInfoRepository;
    @Autowired
    private MotorSchRepository motorSchRepository;
    @Autowired
    private RestTemplate restTemplate;
    private final PolicyRepository policyRepository;
    private final RiskRepository riskRepository;
    private final ClientRepository clientRepository;
    private final InsuredLimitsRepository insuredLimitsRepository;
    private final DocumentRepository documentRepository;
    private final MasterRiskDtlRepository masterRiskDtlRepository;
    private final AmlRepository amlRepository;
    private final ObjectMapper objectMapper;
    private final String UPDATE_CUSTOMER_INFO = "begin  tq_gis.GIN_AGENCY_WEB_PKG.create_portal_agency_policy(?,?,?,?,?,?,?,?); end;";
    
    public UwResponse postUWTransactions(final PolicyInfo policyInfo) {
        String policyNo = null;
        String transmittalNo = null;
        String errorMsg = null;
        String batchNoStr = null;
        String rptCodeStr = null;
        String reportFile = null;
        String scheduleCompatible = "N";
        BigDecimal premium = null;
        if (policyInfo.getPolicyCode() != null) {
            AgencyPolicyInfo policyDtls = this.policyRepository.findPolicyInfo(policyInfo.getPolicyCode());
            System.out.println("policyDtls==" + policyDtls);
            if (policyDtls == null) {
                policyDtls = new AgencyPolicyInfo();
            }
            AgencyRiskInfo riskf = null;
            AgencyDocumentInfo document = null;
            AgencyInsuredLimitsInfo inslimitsf = null;
            final ClientInfo clientDTO = policyInfo.getClientInfo();
            AgencyClientInfo client = this.clientRepository.findClientByClntCode(clientDTO.getCode());
            if (client == null) {
                client = new AgencyClientInfo();
            }
            System.out.println("brkPolicyInfoList==" + client);
            AgencyClientInfo insured = new AgencyClientInfo();
            System.out.println("batchNo" + policyInfo.getPolicyCode());
            scheduleCompatible = this.checkScheduleCompatibility(policyInfo.getAgentShortDescription());
            policyDtls.setPolicyCode(policyInfo.getPolicyCode());
            policyDtls.setPolicyNo(policyInfo.getPolicyNo());
            policyDtls.setClientPolicyNumber(policyInfo.getBinderPolicyNo());
            policyDtls.setRenEndosNo(policyInfo.getEndorsementNo());
            policyDtls.setTransactionCode(policyInfo.getTransactionCode());
            final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            Date date3sql = null;
            try {
                final java.util.Date date2 = sdf1.parse(policyInfo.getCoverFromDate());
                date3sql = new Date(date2.getTime());
            }
            catch (Exception e2) {
                date3sql = null;
            }
            policyDtls.setPolicyCoverFrom(date3sql);
            try {
                final java.util.Date date2 = sdf1.parse(policyInfo.getCoverToDate());
                date3sql = new Date(date2.getTime());
            }
            catch (Exception e2) {
                date3sql = null;
            }
            policyDtls.setPolicyCoverTo(date3sql);
            try {
                final java.util.Date date2 = sdf1.parse(policyInfo.getPolicyDate());
                date3sql = new Date(date2.getTime());
            }
            catch (Exception e2) {
                date3sql = null;
            }
            policyDtls.setPreparedDate(date3sql);
            policyDtls.setProShtDesc(policyInfo.getProductShortDescription());
            policyDtls.setBasicPremium(policyInfo.getPremiumAmount());
            policyDtls.setTotalFap(policyInfo.getFap());
            policyDtls.setTotTl(policyInfo.getTransactionLevy());
            policyDtls.setTotPhfund(policyInfo.getPhcf());
            policyDtls.setBrnShtDesc(policyInfo.getBranchShortDescription());
            policyDtls.setAgntShtDesc(policyInfo.getAgentShortDescription());
            policyDtls.setCurSymbol(policyInfo.getCurrencyShortDescription());
            policyDtls.setFreqOfPayment(policyInfo.getPaymentFrequency());
            policyDtls.setTransType(policyInfo.getTransType());
            policyDtls.setRiskNoteNumber(policyInfo.getRiskNoteNumber());
            policyDtls.setTransactionRemarks(policyInfo.getTransactionRemarks());
            policyDtls.setCommissionAmount(policyInfo.getCommissionAmount());
            policyDtls.setOtherDuties(policyInfo.getOtherDuties());
            policyDtls.setWithholdingTax(policyInfo.getWithholdingTax());
            policyDtls.setClntwCode(clientDTO.getCode());
            policyDtls.setNettPremium(policyInfo.getNettPremium());
            this.policyRepository.save((Object)policyDtls);
            System.out.println("here44..." + policyInfo.getPolicyNo());
            System.out.println("clientDTO..." + clientDTO.getCode());
            client.setCode(clientDTO.getCode());
            client.setShortDescription(clientDTO.getShortDescription());
            client.setName(clientDTO.getName());
            client.setOtherNames(clientDTO.getOtherNames());
            try {
                final java.util.Date date2 = sdf1.parse(clientDTO.getDateOfBirth());
                date3sql = new Date(date2.getTime());
            }
            catch (Exception e2) {
                date3sql = null;
            }
            client.setDateOfBirth(date3sql);
            client.setIdRegistrationNumber(clientDTO.getIdRegistrationNumber());
            client.setPin(clientDTO.getPin());
            client.setPhysicalAddress(clientDTO.getPhysicalAddress());
            client.setPostalAddress(clientDTO.getPostalAddress());
            client.setEmailAddress(clientDTO.getEmailAddress());
            client.setTelephone1(clientDTO.getTelephone1());
            client.setTelephone2(clientDTO.getTelephone2());
            client.setStatus(clientDTO.getStatus());
            client.setFax(clientDTO.getFax());
            client.setType(clientDTO.getType());
            client.setBranchCode(clientDTO.getBranchCode());
            client.setRequestId(clientDTO.getRequestId());
            client.setOccupation(clientDTO.getOccupation());
            client.setSmsTel(clientDTO.getSmsTel());
            client.setSmsTel2(clientDTO.getSmsTel2());
            client.setGender(clientDTO.getGender());
            client.setCountry(clientDTO.getCountry());
            client.setTown(clientDTO.getTown());
            this.clientRepository.save((Object)client);
            if (policyInfo.getDocuments().size() != 0) {
                for (final Documents documentDTO : policyInfo.getDocuments()) {
                    document = this.documentRepository.findByDocName(documentDTO.getDocumentName(), policyInfo.getPolicyCode());
                    if (document == null) {
                        document = new AgencyDocumentInfo();
                    }
                    System.out.println("DocumentName==" + documentDTO.getDocumentName());
                    document.setPolBatchNo(policyInfo.getPolicyCode());
                    document.setDocumentName(documentDTO.getDocumentName());
                    BASE64Decoder decoder = null;
                    byte[] imageByte = null;
                    try {
                        decoder = new BASE64Decoder();
                        imageByte = decoder.decodeBuffer(documentDTO.getDocument());
                    }
                    catch (Exception e3) {
                        imageByte = null;
                    }
                    String RISKNOTE_DOC = null;
                    RISKNOTE_DOC = documentDTO.getDocument();
                    final String docName = documentDTO.getDocumentName();
                    final boolean isEmpty = RISKNOTE_DOC == null || RISKNOTE_DOC.trim().length() == 0;
                    if (!isEmpty) {
                        final String WB_DOC_TYPE = "RSKNOTE";
                        String polBatchNo = null;
                        if (policyInfo.getPolicyCode() != null) {
                            polBatchNo = policyInfo.getPolicyCode().toString();
                        }
                        final GlobalCC globalCC = new GlobalCC();
                        final String docParam = GlobalCC.getGisSysParamValue("DMS_INTERFACE_ENABLED");
                        final String docRepoParam = GlobalCC.getGisSysParamValue("AGENCYWEBSERVICE_DOC_REPOSITORY");
                        System.out.println("docParam1==" + docParam + "docRepoParam1==" + docRepoParam);
                        if (docParam != null && !docParam.equalsIgnoreCase("N")) {
                            if (docParam.equalsIgnoreCase("Y")) {
                                this.saveWebServiceDocs(WB_DOC_TYPE, RISKNOTE_DOC, polBatchNo);
                            }
                        }
                        else if ((docParam == null || docParam.equalsIgnoreCase("N")) && docRepoParam != null) {
                            System.out.println("docParam2==" + docParam + "docRepoParam2==" + docRepoParam);
                            this.saveWebServiceDocsToRepo(WB_DOC_TYPE, imageByte, polBatchNo, docRepoParam, docName);
                        }
                    }
                    document.setDocument(imageByte);
                    document.setFileType(documentDTO.getFileType());
                    document.setDocumentType(documentDTO.getDocumentType());
                    this.documentRepository.save((Object)document);
                }
            }
            if (policyInfo.getRiskInfo().size() != 0) {
                for (final RiskInfo risk : policyInfo.getRiskInfo()) {
                    riskf = this.riskRepository.findByIpuId(risk.getRiskIpuCode());
                    if (riskf == null) {
                        riskf = new AgencyRiskInfo();
                    }
                    final ClientInfo insuredDTO = risk.getClientInfo();
                    insured = this.clientRepository.findClientByClntCode(insuredDTO.getCode());
                    if (insured == null) {
                        insured = new AgencyClientInfo();
                    }
                    insured.setCode(insuredDTO.getCode());
                    insured.setShortDescription(insuredDTO.getShortDescription());
                    insured.setName(insuredDTO.getName());
                    insured.setOtherNames(insuredDTO.getOtherNames());
                    try {
                        final java.util.Date date2 = sdf1.parse(insuredDTO.getDateOfBirth());
                        date3sql = new Date(date2.getTime());
                    }
                    catch (Exception e) {
                        date3sql = null;
                    }
                    insured.setDateOfBirth(date3sql);
                    insured.setIdRegistrationNumber(insuredDTO.getIdRegistrationNumber());
                    insured.setPin(insuredDTO.getPin());
                    insured.setPhysicalAddress(insuredDTO.getPhysicalAddress());
                    insured.setPostalAddress(insuredDTO.getPostalAddress());
                    insured.setEmailAddress(insuredDTO.getEmailAddress());
                    insured.setTelephone1(insuredDTO.getTelephone1());
                    insured.setTelephone2(insuredDTO.getTelephone2());
                    insured.setStatus(insuredDTO.getStatus());
                    insured.setFax(insuredDTO.getFax());
                    insured.setType(insuredDTO.getType());
                    insured.setBranchCode(insuredDTO.getBranchCode());
                    insured.setRequestId(insuredDTO.getRequestId());
                    this.clientRepository.save((Object)insured);
                    riskf.setIpuId(risk.getIpuId());
                    riskf.setRiskId(risk.getRiskId());
                    riskf.setIpuPolwId(policyInfo.getPolicyCode());
                    riskf.setRiskDescription(risk.getRiskDescription());
                    try {
                        final java.util.Date date2 = sdf1.parse(risk.getCoverFromDate());
                        date3sql = new Date(date2.getTime());
                    }
                    catch (Exception e) {
                        date3sql = null;
                    }
                    riskf.setRiskCoverFromDate(date3sql);
                    try {
                        final java.util.Date date2 = sdf1.parse(risk.getCoverToDate());
                        date3sql = new Date(date2.getTime());
                    }
                    catch (Exception e) {
                        date3sql = null;
                    }
                    riskf.setRiskCoverToDate(date3sql);
                    riskf.setRiskValue(risk.getRiskValue());
                    riskf.setRiskIpuCode(risk.getRiskIpuCode());
                    riskf.setClntwCode(insuredDTO.getCode());
                    riskf.setPremium(risk.getRiskPremium());
                    riskf.setBinderShortDescription(risk.getBinderShortDescription());
                    riskf.setCoverTypeShortDescription(risk.getCoverTypeShortDescription());
                    riskf.setCoverTypeDescription(risk.getCoverTypeDescription());
                    riskf.setSubClassShortDescription(risk.getSubClassShortDescription());
                    riskf.setPrevSubClassShortDescription(risk.getPrevSubClassShortDescription());
                    riskf.setPrevRiskId(risk.getPrevRiskId());
                    riskf.setRiskAddEdit(risk.getRiskAddEdit());
                    System.out.println("hereafterriskf== ");
                    Label_2278: {
                        if (scheduleCompatible.equalsIgnoreCase("Y")) {
                            try {
                                final ObjectMapper mapper = new ObjectMapper();
                                final String jsonSchedule = "{\"riskAdditionalInfo\":" + mapper.writeValueAsString(risk.getRiskAdditionalInfo()) + "}";
                                System.out.println("testme== " + jsonSchedule);
                                System.out.println("riskAdditionalInfo=====qqq " + risk.getRiskAdditionalInfo());
                                final JsonTreeIterator jsonTreeIterator = new JsonTreeIterator(this.jdbcTemplate, risk.getRiskIpuCode(), this.masterRiskDtlRepository, policyInfo.getProductShortDescription());
                                jsonTreeIterator.convertJSONToNode(jsonSchedule);
                                break Label_2278;
                            }
                            catch (Exception e) {
                                throw new ApiException("Could not process additional risk details", e.getMessage());
                            }
                        }
                        for (final RiskAdditionalInfo rsk : risk.getRskAdditionalInfo()) {
                            if (risk.getRskAdditionalInfo() != null && risk.getRskAdditionalInfo().size() != 0) {
                                final MotorInfo motorDTO = rsk.getMotor();
                                AgencyMotorSchInfo motorSchInfo = this.motorSchRepository.findByRiskIpuCode(risk.getRiskIpuCode());
                                if (motorSchInfo == null) {
                                    motorSchInfo = new AgencyMotorSchInfo();
                                }
                                motorSchInfo.setBodyType(motorDTO.getBodyType());
                                motorSchInfo.setCarryCapacity(motorDTO.getCarryCapacity());
                                motorSchInfo.setChasisNo(motorDTO.getChasisNo());
                                motorSchInfo.setCoverType(motorDTO.getCoverType());
                                motorSchInfo.setCubicCapacity(motorDTO.getCubicCapacity());
                                motorSchInfo.setEngineNo(motorDTO.getEngineNo());
                                motorSchInfo.setItemno(motorDTO.getItemno());
                                motorSchInfo.setMake(motorDTO.getMake());
                                motorSchInfo.setRegNo(motorDTO.getRegNo());
                                motorSchInfo.setValue(motorDTO.getValue());
                                motorSchInfo.setYrManft(motorDTO.getYrManft());
                                motorSchInfo.setRiskIpuCode(risk.getRiskIpuCode());
                                this.motorSchRepository.save((Object)motorSchInfo);
                            }
                        }
                    }
                    riskf = (AgencyRiskInfo)this.riskRepository.save((Object)riskf);
                    if (risk.getRiskSections() != null && risk.getRiskSections().size() != 0) {
                        for (final RiskSection limit : risk.getRiskSections()) {
                            inslimitsf = this.insuredLimitsRepository.findByShortDescription(limit.getShortDescription(), risk.getRiskIpuCode());
                            if (inslimitsf == null) {
                                inslimitsf = new AgencyInsuredLimitsInfo();
                            }
                            inslimitsf.setDescription(limit.getDescription());
                            inslimitsf.setLimitAmount(limit.getLimitAmount());
                            inslimitsf.setShortDescription(limit.getShortDescription());
                            inslimitsf.setPremRate(limit.getPremRate());
                            inslimitsf.setRiskIpuCode(risk.getRiskIpuCode());
                            this.insuredLimitsRepository.save((Object)inslimitsf);
                        }
                    }
                }
            }
            Connection conn = null;
            CallableStatement stmt = null;
            try {
                final JdbcTemplate jdbcTemplate2 = (JdbcTemplate)BeanUtil.getBean((Class)JdbcTemplate.class);
                conn = jdbcTemplate2.getDataSource().getConnection();
                stmt = conn.prepareCall("begin  tq_gis.GIN_AGENCY_WEB_PKG.create_portal_agency_policy(?,?,?,?,?,?,?,?); end;");
                stmt.setBigDecimal(1, policyInfo.getTransactionCode());
                stmt.setString(2, policyInfo.getAgentShortDescription());
                stmt.registerOutParameter(3, 12);
                stmt.registerOutParameter(4, 12);
                stmt.registerOutParameter(5, 12);
                stmt.registerOutParameter(6, 12);
                stmt.registerOutParameter(7, 12);
                stmt.registerOutParameter(8, 12);
                stmt.execute();
                policyNo = stmt.getString(3);
                transmittalNo = stmt.getString(4);
                errorMsg = stmt.getString(5);
                batchNoStr = stmt.getString(6);
                rptCodeStr = stmt.getString(7);
                premium = stmt.getBigDecimal(8);
            }
            catch (Exception ex) {
                UwServiceImpl.log.error(ex.getLocalizedMessage(), (Throwable)ex);
            }
            finally {
                DbUtils.closeQuietly(conn, (Statement)stmt, (ResultSet)null);
            }
            BigDecimal rptCode = null;
            BigDecimal batchNo = null;
            if (rptCodeStr != null && batchNoStr != null) {
                rptCode = new BigDecimal(rptCodeStr);
                batchNo = new BigDecimal(batchNoStr);
                reportFile = this.generateEndorsementReport(rptCode, batchNo);
            }
        }
        System.out.println("policyNo==" + policyNo);
        final Random rnd = new Random();
        final int n = 100000 + rnd.nextInt(900000);
        final UwResponse simulatorResponses = new UwResponse();
        final UwResponse simulatorResponse = new UwResponse(new BigDecimal(n), "Success", "Submitted", policyNo, transmittalNo, errorMsg, reportFile, premium);
        simulatorResponses.setMessage(simulatorResponse.getMessage());
        simulatorResponses.setStatus(simulatorResponse.getStatus());
        simulatorResponses.setTransCode(simulatorResponse.getTransCode());
        simulatorResponses.setPolPolicyNo(policyNo);
        simulatorResponses.setTransmittalNo(transmittalNo);
        simulatorResponses.setErrorMsg(errorMsg);
        simulatorResponses.setReportFile(reportFile);
        simulatorResponses.setPremium(premium);
        System.out.println("here14367....");
        return simulatorResponses;
    }
    
    public String updateStatus(final UwResponse uwResponse) {
        final List<InsPolicyInfo> brkPolicyInfoList = this.insPolicyInfoRepository.findPolicyInfo(uwResponse.getTransCode());
        final InsPolicyInfo brkPolicyInfo = brkPolicyInfoList.get(0);
        final String s = "S,A,R";
        final List<String> myList = new ArrayList<String>(Arrays.asList(s.split(",")));
        System.out.println("here2....");
        if (myList.contains(uwResponse.getStatus().substring(0, 1))) {
            brkPolicyInfo.setProcessStatus(uwResponse.getStatus().substring(0, 1));
            System.out.println("here3....");
            this.insPolicyInfoRepository.save((Object)brkPolicyInfo);
        }
        System.out.println("here4....");
        return "Updated";
    }
    
    public BrkResponseDTO updateUwStatus(final List<BrkResponseDTO> uwResponses) {
        final BrkResponseDTO brkResponseDTO = new BrkResponseDTO("Success", "Updated Successfully", null);
        final GlobalCC globalCC = new GlobalCC();
        final String url = GlobalCC.getGisSysParamValue("AGENCYWEB_STATUSUPDATEURL");
        try {
            final HttpHeaders requestHeaders = new HttpHeaders();
            requestHeaders.setContentType(MediaType.APPLICATION_JSON);
            requestHeaders.setAccept((List)Arrays.asList(MediaType.APPLICATION_JSON));
            System.out.println("uwResponses==:" + uwResponses);
            final HttpEntity<List<BrkResponseDTO>> requestBody = (HttpEntity<List<BrkResponseDTO>>)new HttpEntity((Object)uwResponses);
            final ResponseEntity<UwResponse> result = (ResponseEntity<UwResponse>)this.restTemplate.postForEntity(url, (Object)requestBody, (Class)UwResponse.class, new Object[0]);
            System.out.println("Status code:" + result.getStatusCode());
            if (result.getStatusCode() == HttpStatus.OK) {
                final UwResponse e = (UwResponse)result.getBody();
                System.out.println("(Client Side) Employee Created: " + e.getMessage());
                brkResponseDTO.setMessage(e.getMessage());
                brkResponseDTO.setStatus(e.getStatus());
            }
        }
        catch (Exception e2) {
            e2.printStackTrace();
        }
        return brkResponseDTO;
    }
    
    public void saveWebServiceDocs(final String wB_DOC_TYPE, final String wB_DOC, final String wB_POL_BATCH_NO) {
        try {
            final HttpClient client = (HttpClient)new DefaultHttpClient();
            final GlobalCC globalCC = new GlobalCC();
            String dmsUrl = GlobalCC.getGisSysParamValue("AGENCYDOCDMSUPLOAD_URL");
            dmsUrl += "uploadKCBDocument";
            final HttpPost post = new HttpPost(dmsUrl);
            final String jsondata = "{\"wB_DOC_TYPE\": \"RSKNOTE_" + wB_POL_BATCH_NO + ".PDF\",\"wB_POL_BATCH_NO\": \"" + wB_POL_BATCH_NO + "\",\"wB_DOC\": \"" + wB_DOC + "\"}";
            final StringEntity jsonparam = new StringEntity(jsondata);
            jsonparam.setChunked(true);
            post.addHeader("content-type", "application/json;charset=UTF-8");
            post.setEntity((org.apache.http.HttpEntity)jsonparam);
            System.out.println(post);
            final HttpResponse response = client.execute((HttpUriRequest)post);
            System.out.println(response);
            int StatusCode = 0;
            StatusCode = response.getStatusLine().getStatusCode();
            if (StatusCode == 200) {}
        }
        catch (Exception ex) {}
    }
    
    public void saveWebServiceDocsToRepo(final String wB_DOC_TYPE, final byte[] imageByte, final String wB_POL_BATCH_NO, final String docRepoParam, final String docName) {
        final InputStream is = null;
        File image = null;
        OutputStream os = null;
        System.out.println("docRepoParam==" + docRepoParam + "wB_POL_BATCH_NO==" + wB_POL_BATCH_NO);
        try {
            try {
                final byte[] buffer = new byte[1024];
                System.out.println("docRepoParam==" + docRepoParam + wB_POL_BATCH_NO + ".PDF");
                System.out.println("docRepoParam2==" + docRepoParam);
                if (docRepoParam != null) {
                    image = new File(docRepoParam + docName + "_" + wB_POL_BATCH_NO + ".PDF");
                    os = new FileOutputStream(image);
                    os.write(imageByte);
                    System.out.println("Successfully byte inserted");
                    os.close();
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        catch (Exception ex) {}
        finally {
            try {
                os.close();
                is.close();
            }
            catch (Exception ex2) {}
        }
    }
    
    public String generateEndorsementReport(final BigDecimal rptCode, final BigDecimal batchNO) {
        String byteArray = null;
        try {
            final RptParametersDTOWrapper request = new RptParametersDTOWrapper();
            final List<RptParametersDTO> rptparam = new ArrayList<RptParametersDTO>();
            final GlobalCC globalCC = new GlobalCC();
            final String rptGenUrl = GlobalCC.getGisSysParamValue("RPT_GENERATION_SERVICE");
            final RptParametersDTO param = new RptParametersDTO();
            request.setEncodeFormat("BASE64");
            request.setReportFormat("pdf");
            request.setRptCode(rptCode);
            param.setName("V_BATCHNO");
            param.setValue(batchNO);
            rptparam.add(param);
            request.setParams(rptparam);
            final ObjectMapper objectMapper = new ObjectMapper();
            final com.mashape.unirest.http.HttpResponse<String> serverResponse = (com.mashape.unirest.http.HttpResponse<String>)Unirest.post(rptGenUrl).header("Content-Type", "application/json").body(objectMapper.writeValueAsString((Object)request)).asString();
            byteArray = (String)serverResponse.getBody();
            System.out.println(byteArray);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return byteArray;
    }
    
    public AmlResponse postAmlTransactions(final AmlInfo amlInfo) {
        if (amlInfo.getRiskId() != null) {
            AgencyAmlInfo amlDtls = this.amlRepository.findAmlByRiskId(amlInfo.getRiskId());
            if (amlDtls == null) {
                amlDtls = new AgencyAmlInfo();
            }
            amlDtls.setPolicyNo(amlInfo.getPolicyNo());
            amlDtls.setRiskId(amlInfo.getRiskId());
            amlDtls.setSourceOfFunds(amlInfo.getSourceOfFunds());
            amlDtls.setEmployed(amlInfo.getEmployed());
            amlDtls.setOccupation(amlInfo.getOccupation());
            amlDtls.setEconomicSector(amlInfo.getEconomicSector());
            amlDtls.setNationality(amlInfo.getNationality());
            amlDtls.setCitizenship(amlInfo.getCitizenship());
            this.amlRepository.save((Object)amlDtls);
        }
        final Random rnd = new Random();
        final int n = 100000 + rnd.nextInt(900000);
        final AmlResponse simulatorResponses = new AmlResponse();
        final AmlResponse simulatorResponse = new AmlResponse(new BigDecimal(n), "Success", "Submitted");
        simulatorResponses.setMessage(simulatorResponse.getMessage());
        simulatorResponses.setStatus(simulatorResponse.getStatus());
        simulatorResponses.setTransCode(simulatorResponse.getTransCode());
        return simulatorResponses;
    }
    
    public CertificateResponse issueAkiCertificate(final CertificateRequest certificateRequest) {
        Connection conn = null;
        final JdbcTemplate jdbcTemplate2 = (JdbcTemplate)BeanUtil.getBean((Class)JdbcTemplate.class);
        PreparedStatement pst = null;
        ResultSet rst = null;
        String regNo = null;
        String agnShtDesc = null;
        String creditPolicyExcepted = null;
        BigDecimal policyPremium = null;
        String paymentProcessed = null;
        CertificateResponse certificateResponse = new CertificateResponse();
        try {
            conn = jdbcTemplate2.getDataSource().getConnection();
            String query = "SELECT nvl(agn_regulator_number,agn_reg_code) agn_license_no, \nDECODE (covt_sht_desc,'TPO', '200','COMP', '100','300') covt_sht_desc, \ngis_utilities.clnt_name (b.clnt_name, b.clnt_other_names) policyholder, \npol_policy_no, to_char(SYSDATE,'DD/MM/YYYY')polc_wef, to_char(ipu_wet,'DD/MM/YYYY')polc_wet, ipu_property_id, \nmps_chasis_no chassisnumber, SUBSTR (NVL (b.clt_cell_no, b.clnt_sms_tel), -9) clnt_tel, mps_body_type bodytype, \nmps_make vehiclemake, mps_make/*mps_model*/ vehiclemodel, mps_yr_manft yearofregistration, \nmps_engine_no enginenumber, a.clnt_email_addrs clnt_email_addrs,  \n(select ct_type from gin_subclass_cert_types,gin_cert_types where ct_type is not null  \nand sct_ct_code = ct_code and sct_scl_code=ipu_sec_scl_code and sct_covt_code = covt_code AND rownum=1)ct_type, \nipu_code,nvl(ipu_value,0)ipu_value,mps_carry_capacity carry_capacity,null bus_type,null tonnage, \nnull typeOfCert,b.clnt_pin clnt_pin,ipu_pol_ren_endos_no,pol_batch_no,  \n(select ct_code from gin_subclass_cert_types,gin_cert_types where ct_type is not null  \nand sct_ct_code = ct_code and sct_scl_code=ipu_sec_scl_code and sct_covt_code = covt_code AND rownum=1)ct_code,  \n(select ct_sht_desc from gin_subclass_cert_types,gin_cert_types where ct_type is not null  \nand sct_ct_code = ct_code and sct_scl_code=ipu_sec_scl_code and sct_covt_code = covt_code AND rownum=1)ct_sht_desc, \nagn_sht_desc,nvl(pol_tot_endos_diff_amt,0)+ nvl(pol_duties,0)+  nvl ( pol_tot_tl , 0 ) + nvl(pol_phfund,0) premium \nFROM gin_policies, \ntqc_agencies, \ngin_insured_property_unds, \ngin_policy_insureds, \ntqc_clients a, \ntqc_clients b, \ngin_motor_private_sch,  \ngin_cover_types \nWHERE regexp_replace(ipu_property_id|| chr(9), '[[:space:]]', '') = regexp_replace(:v_property_id|| chr(9), '[[:space:]]', '') \nAND pol_policy_no=:v_policy_no \nAND pol_batch_no = ipu_pol_batch_no \nAND pol_agnt_agent_code = agn_code \nAND ipu_polin_code = polin_code \nAND pol_prp_code = a.clnt_code \nand polin_prp_code = b.clnt_code \nAND mps_ipu_code = ipu_code \nAND ipu_covt_code = covt_code \nand pol_current_status in('A','D') \nAND pol_policy_status NOT IN ('DC', 'CN','CO') \nUNION \nSELECT nvl(agn_regulator_number,agn_reg_code) agn_license_no, \nDECODE (covt_sht_desc,'TPO', '200','COMP', '100','300') covt_sht_desc, \ngis_utilities.clnt_name (b.clnt_name, b.clnt_other_names) policyholder, \npol_policy_no, to_char(SYSDATE,'DD/MM/YYYY')polc_wef, to_char(ipu_wet,'DD/MM/YYYY')polc_wet, ipu_property_id, \nmcoms_chasis_no chassisnumber, SUBSTR (NVL (b.clt_cell_no, b.clnt_sms_tel), -9) clnt_tel, mcoms_body_type bodytype, \nmcoms_make vehiclemake, mcoms_make/*ipu_vehicle_model*/ vehiclemodel, mcoms_yr_manft yearofregistration, \nmcoms_engine_no enginenumber, a.clnt_email_addrs clnt_email_addrs,  \n(select ct_type from gin_subclass_cert_types,gin_cert_types where ct_type is not null  \nand sct_ct_code = ct_code and sct_scl_code=ipu_sec_scl_code and sct_covt_code = covt_code AND rownum=1)ct_type, \nipu_code,nvl(ipu_value,0)ipu_value,to_number(translate (mcoms_carry_capacity,'0'||translate (mcoms_carry_capacity,'x0123456789','x'),'0')) carry_capacity,  \n(SELECT ABT_CODE FROM GIN_AKI_BUSINESS_TYPES,GIN_SUBCLASS_CERT_TYPES WHERE ABT_CODE=SCT_ABT_CODE AND SCT_SCL_CODE=IPU_SEC_SCL_CODE AND SCT_COVT_CODE=IPU_COVT_CODE AND rownum=1) bus_type, \nDECODE((SELECT SCT_TONNAGE_APPL FROM GIN_SUBCLASS_CERT_TYPES WHERE SCT_SCL_CODE=IPU_SEC_SCL_CODE AND SCT_COVT_CODE=IPU_COVT_CODE AND rownum=1),'Y',mcoms_tonnage,to_number(translate (mcoms_carry_capacity,'0'||translate (mcoms_carry_capacity,'x0123456789','x'),'0'))) tonnage, \n(SELECT ACRT_CODE FROM GIN_AKI_CERT_TYPES,GIN_SUBCLASS_CERT_TYPES WHERE ACRT_CODE=SCT_ACRT_CODE AND SCT_SCL_CODE=IPU_SEC_SCL_CODE AND SCT_COVT_CODE=IPU_COVT_CODE AND rownum=1)typeOfCert,  \nb.clnt_pin clnt_pin,ipu_pol_ren_endos_no,pol_batch_no,  \n(select ct_code from gin_subclass_cert_types,gin_cert_types where ct_type is not null  \nand sct_ct_code = ct_code and sct_scl_code=ipu_sec_scl_code and sct_covt_code = covt_code AND rownum=1)ct_code,  \n(select ct_sht_desc from gin_subclass_cert_types,gin_cert_types where ct_type is not null  \nand sct_ct_code = ct_code and sct_scl_code=ipu_sec_scl_code and sct_covt_code = covt_code AND rownum=1)ct_sht_desc, \nagn_sht_desc,nvl(pol_tot_endos_diff_amt,0)+ nvl(pol_duties,0)+  nvl ( pol_tot_tl , 0 ) + nvl(pol_phfund,0) premium \nFROM gin_policies, \n tqc_agencies, \ngin_insured_property_unds, \ngin_policy_insureds, \ntqc_clients a, \ntqc_clients b, \ngin_motor_commercial_sch,   \ngin_cover_types \nWHERE regexp_replace(ipu_property_id|| chr(9), '[[:space:]]', '') = regexp_replace(:v_property_id|| chr(9), '[[:space:]]', '') \nAND pol_policy_no=:v_policy_no \nAND pol_batch_no = ipu_pol_batch_no \nAND pol_agnt_agent_code = agn_code \nAND ipu_polin_code = polin_code \nAND pol_prp_code = a.clnt_code \nand polin_prp_code = b.clnt_code \nAND mcoms_ipu_code = ipu_code \nAND ipu_covt_code = covt_code \nand pol_current_status in('A','D') \nAND pol_policy_status NOT IN ('DC', 'CN','CO') \nUNION \nSELECT nvl(agn_regulator_number,agn_reg_code) agn_license_no, \nDECODE (covt_sht_desc,'TPO', '200','COMP', '100','300') covt_sht_desc, \ngis_utilities.clnt_name (b.clnt_name, b.clnt_other_names) policyholder, \npol_policy_no, to_char(SYSDATE,'DD/MM/YYYY')polc_wef, to_char(ipu_wet,'DD/MM/YYYY')polc_wet, ipu_property_id, \nmcs_frame_no chassisnumber, SUBSTR (NVL (b.clt_cell_no, b.clnt_sms_tel), -9) clnt_tel, mcs_body_type bodytype, \nmcs_make vehiclemake,mcs_make /*ipu_vehicle_model*/ vehiclemodel, mcs_yr_manft yearofregistration, \nmcs_engine_no enginenumber, a.clnt_email_addrs clnt_email_addrs, \n(select ct_type from gin_subclass_cert_types,gin_cert_types where ct_type is not null and sct_ct_code = ct_code and sct_scl_code=ipu_sec_scl_code and sct_covt_code = covt_code AND rownum=1)ct_type, \n ipu_code,nvl(ipu_value,0)ipu_value,mcs_carry_capacity carry_capacity,null bus_type,null tonnage,  \n(SELECT ACRT_CODE FROM GIN_AKI_CERT_TYPES,GIN_SUBCLASS_CERT_TYPES WHERE ACRT_CODE=SCT_ACRT_CODE AND SCT_SCL_CODE=IPU_SEC_SCL_CODE AND SCT_COVT_CODE=IPU_COVT_CODE AND rownum=1)typeOfCert,  \nb.clnt_pin clnt_pin,ipu_pol_ren_endos_no,pol_batch_no,  \n(select ct_code from gin_subclass_cert_types,gin_cert_types where ct_type is not null  \nand sct_ct_code = ct_code and sct_scl_code=ipu_sec_scl_code and sct_covt_code = covt_code AND rownum=1)ct_code,  \n(select ct_sht_desc from gin_subclass_cert_types,gin_cert_types where ct_type is not null  \nand sct_ct_code = ct_code and sct_scl_code=ipu_sec_scl_code and sct_covt_code = covt_code AND rownum=1)ct_sht_desc, \nagn_sht_desc,nvl(pol_tot_endos_diff_amt,0)+ nvl(pol_duties,0)+  nvl ( pol_tot_tl , 0 ) + nvl(pol_phfund,0) premium \nFROM gin_policies, \ntqc_agencies, \ngin_insured_property_unds, \ngin_policy_insureds, \ntqc_clients a, \ntqc_clients b, \ngin_motor_cycle_sch, \ngin_cover_types \nWHERE regexp_replace(ipu_property_id|| chr(9), '[[:space:]]', '') = regexp_replace(:v_property_id|| chr(9), '[[:space:]]', '') \nAND pol_policy_no=:v_policy_no \nAND pol_batch_no = ipu_pol_batch_no \nAND pol_agnt_agent_code = agn_code \nAND ipu_polin_code = polin_code \nAND pol_prp_code = a.clnt_code \nand polin_prp_code = b.clnt_code \nAND mcs_ipu_code = ipu_code \nAND ipu_covt_code = covt_code \nand pol_current_status in('A','D') \nAND pol_policy_status NOT IN ('DC', 'CN','CO')";
            query = query.replaceAll(":v_property_id", (certificateRequest.getRiskId() != null) ? ("'" + certificateRequest.getRiskId() + "'") : "null");
            query = query.replaceAll(":v_policy_no", (certificateRequest.getPolicyNo() != null) ? ("'" + certificateRequest.getPolicyNo() + "'") : "null");
            pst = conn.prepareStatement(query);
            rst = pst.executeQuery();
            final CertificateInfo certificateInfo = new CertificateInfo();
            if (rst.next()) {
                certificateInfo.setIntermediaryIRANumber(this.replaceNullValues(rst.getString(1)));
                certificateInfo.setTypeofcover(this.replaceNullValues(rst.getString(2)));
                certificateInfo.setPolicyholder(this.replaceNullValues(rst.getString(3)));
                certificateInfo.setPolicynumber(this.replaceNullValues(rst.getString(4)));
                certificateInfo.setCommencingdate(this.replaceNullValues(rst.getString(5)));
                certificateInfo.setExpiringdate(this.replaceNullValues(rst.getString(6)));
                certificateInfo.setRegNo(this.replaceNullValues(rst.getString(7)));
                regNo = this.replaceNullValues(rst.getString(7));
                certificateInfo.setChassisnumber(this.replaceNullValues(rst.getString(8)));
                certificateInfo.setPhonenumber(this.replaceNullValues(rst.getString(9)));
                certificateInfo.setBodytype(this.replaceNullValues(rst.getString(10)));
                certificateInfo.setVehiclemake(this.replaceNullValues(rst.getString(11)));
                certificateInfo.setVehiclemodel(this.replaceNullValues(rst.getString(12)));
                certificateInfo.setYearofregistration(this.replaceNullValues(rst.getString(13)));
                certificateInfo.setEnginenumber(this.replaceNullValues(rst.getString(14)));
                certificateInfo.setEmail(this.replaceNullValues(rst.getString(15)));
                certificateInfo.setCertType(this.replaceNullValues(rst.getString(16)));
                certificateInfo.setIpuCode(rst.getBigDecimal(17));
                certificateInfo.setSumInsured(this.replaceNullValues(rst.getString(18)));
                certificateInfo.setLicensedtocarry(this.replaceNullValues(rst.getString(19)));
                certificateInfo.setBusType(this.replaceNullValues(rst.getString(20)));
                certificateInfo.setTonnage(this.replaceNullValues(rst.getString(21)));
                certificateInfo.setTypeOfCertificate(this.replaceNullValues(rst.getString(22)));
                certificateInfo.setInsuredPIN(this.replaceNullValues(rst.getString(23)));
                certificateInfo.setEndorseNo(this.replaceNullValues(rst.getString(24)));
                certificateInfo.setBatchNo(rst.getBigDecimal(25));
                certificateInfo.setCtCode(rst.getBigDecimal(26));
                certificateInfo.setCtShtDesc(this.replaceNullValues(rst.getString(27)));
                agnShtDesc = rst.getString(28);
                policyPremium = rst.getBigDecimal(29);
            }
            if (certificateRequest.getTransmittalNo() == null || certificateRequest.getTransmittalNo().toString().length() == 0) {
                certificateResponse.setMessage("Payment Reference Not Provided");
                return certificateResponse;
            }
            if (certificateRequest.getRiskIpuCode() == null) {
                certificateResponse.setMessage("Risk Entry In Broker System Not Provided");
                return certificateResponse;
            }
            if (certificateRequest.getRiskId() == null || certificateRequest.getRiskId().toString().length() == 0) {
                certificateResponse.setMessage("Risk Id Has Not Been Provided");
                return certificateResponse;
            }
            if (certificateRequest.getPolicyNo() == null || certificateRequest.getPolicyNo().toString().length() == 0) {
                certificateResponse.setMessage("Policy Number Has Not Been Provided");
                return certificateResponse;
            }
            if (regNo == null || regNo.toString().length() == 0) {
                certificateResponse.setMessage("No Active/Draft Policy Found in the system");
                return certificateResponse;
            }
            creditPolicyExcepted = this.checkCreditPolicyStatus(agnShtDesc);
            if (creditPolicyExcepted.equalsIgnoreCase("N")) {
                paymentProcessed = this.validatePaymentTransactions(certificateRequest.getTransmittalNo(), policyPremium, certificateInfo.getPolicynumber());
                if (paymentProcessed.equalsIgnoreCase("N")) {
                    certificateResponse.setMessage("Payment for this policy is yet to be processed");
                    return certificateResponse;
                }
            }
            final String success = this.authenticateAkiApis();
            if (success.equalsIgnoreCase("N")) {
                certificateResponse.setMessage("Error Encountered On Aki APIs Authentication");
                return certificateResponse;
            }
            certificateResponse = this.certAllocation(certificateInfo);
            if (certificateResponse.getActualCNo() != null) {
                this.insertCertificateDetails(certificateInfo, certificateResponse);
            }
        }
        catch (Exception ex) {}
        return certificateResponse;
    }
    
    public CertificateResponse certAllocation(final CertificateInfo certificateInfo) {
        final String VehicleType = certificateInfo.getBusType();
        final String Yearofmanufacture = certificateInfo.getYearofregistration();
        final String HudumaNumber = "";
        final String Registrationnumber = certificateInfo.getRegNo().replaceAll(" ", "");
        String msg = "1Error Encountered While Invoking Aki API Certificate Issuence Search ";
        String status_desc = null;
        String actualCNo = null;
        final GlobalCC globalCC = new GlobalCC();
        final String akiconnClientID = GlobalCC.getGisSysParamValue("AKI_API_CLIENT_ID");
        final String akiproceURL = GlobalCC.getGisSysParamValue("AKI_API_PROCURL");
        final CertificateResponse certificateResponse = new CertificateResponse();
        final HashMap certTypesMap = new HashMap();
        certTypesMap.put("A", 1);
        certTypesMap.put("B", 2);
        certTypesMap.put("C", 3);
        certTypesMap.put("D", 4);
        final int certTypeVal = Integer.valueOf(certTypesMap.get(certificateInfo.getCertType()).toString());
        int certificateType = 0;
        if (certificateInfo.getTypeOfCertificate() != null) {
            if (certificateInfo.getTypeOfCertificate().toString().length() != 0) {
                certificateType = Integer.valueOf(certificateInfo.getTypeOfCertificate());
            }
        }
        final int akiTypeofcover = Integer.valueOf(certificateInfo.getTypeofcover());
        int yom = 0;
        if (certificateInfo.getYearofregistration() != null) {
            if (certificateInfo.getYearofregistration().toString().length() != 0) {
                yom = Integer.valueOf(certificateInfo.getYearofregistration());
            }
        }
        int tonnageCapacity = 0;
        if (certificateInfo.getTonnage() != null) {
            if (certificateInfo.getTonnage().toString().length() != 0) {
                tonnageCapacity = Integer.valueOf(certificateInfo.getTonnage());
            }
        }
        int typeOfVehicle = 0;
        if (VehicleType != null) {
            if (VehicleType.toString().length() != 0) {
                typeOfVehicle = Integer.valueOf(VehicleType);
            }
        }
        switch (certTypeVal) {
            case 1: {
                final IssuanceTypeARequest requestA = new IssuanceTypeARequest();
                requestA.setTypeOfCertificate(Integer.valueOf(certificateType));
                requestA.setTypeofcover(Integer.valueOf(akiTypeofcover));
                requestA.setPolicyholder(certificateInfo.getPolicyholder());
                requestA.setPolicynumber(certificateInfo.getPolicynumber());
                requestA.setCommencingdate(certificateInfo.getCommencingdate());
                requestA.setExpiringdate(certificateInfo.getExpiringdate());
                requestA.setRegistrationnumber(Registrationnumber);
                int licencedToCarry = 0;
                if ((certificateType == 1 || certificateType == 9 || certificateType == 4 || certificateType == 8) && certificateInfo.getLicensedtocarry() != null) {
                    if (certificateInfo.getLicensedtocarry().toString().length() != 0) {
                        licencedToCarry = Integer.valueOf(certificateInfo.getLicensedtocarry());
                    }
                }
                requestA.setLicensedtocarry(Integer.valueOf(licencedToCarry));
                requestA.setChassisnumber(certificateInfo.getChassisnumber());
                requestA.setYearofmanufacture(Integer.valueOf(yom));
                requestA.setInsuredPIN(certificateInfo.getInsuredPIN());
                requestA.setEmail(certificateInfo.getEmail());
                requestA.setPhonenumber(certificateInfo.getPhonenumber());
                requestA.setBodytype(certificateInfo.getBodytype());
                requestA.setSumInsured(Integer.valueOf(Integer.parseInt(certificateInfo.getSumInsured())));
                requestA.setVehiclemake(certificateInfo.getVehiclemake());
                requestA.setVehiclemodel(certificateInfo.getVehiclemodel());
                requestA.setIntermediaryIRANumber(certificateInfo.getIntermediaryIRANumber());
                try {
                    final IssuanceTypeAResponse resA = UwServiceImpl.service.issueTypeACertificate(requestA, akiconnClientID, String.format("%s%s", akiproceURL, "IssuanceTypeACertificate"));
                    if (null != resA && resA.getSuccess()) {
                        final IssueCertificate issuedCertificate = resA.getIssuanceTypeAResponseCallbackObj().getIssueCertificate();
                        msg = "5Aki Electronic Cert Successfully Allocated";
                        status_desc = "Aki Electronic Cert Successfully Allocated";
                        actualCNo = issuedCertificate.getActualCNo();
                        certificateResponse.setMessage(status_desc);
                        certificateResponse.setRiskId(certificateInfo.getRegNo());
                        certificateResponse.setPolicyNo(certificateInfo.getPolicynumber());
                        certificateResponse.setActualCNo(actualCNo);
                        certificateResponse.setTransactionNo(issuedCertificate.getTransactionNo());
                        certificateResponse.setRequestNumber(resA.getAPIRequestNumber());
                    }
                    else if (null != resA && resA.getError().size() > 0) {
                        final List<AkiError> errorsA = (List<AkiError>)resA.getError();
                        String err = "";
                        for (int i = 0; i < errorsA.size(); ++i) {
                            err = err.concat(String.format("%s - %s %s", errorsA.get(i).getErrorCode(), errorsA.get(i).getErrorText(), "\n"));
                        }
                        certificateResponse.setMessage(err);
                        certificateResponse.setRiskId(certificateInfo.getRegNo());
                        certificateResponse.setPolicyNo(certificateInfo.getPolicynumber());
                        GlobalCC.INFORMATIONREPORTING(err);
                    }
                }
                catch (Exception e) {
                    GlobalCC.EXCEPTIONREPORTING(e);
                }
                break;
            }
            case 2: {
                final IssuanceTypeBRequest requestB = new IssuanceTypeBRequest();
                requestB.setTypeofcover(Integer.valueOf(akiTypeofcover));
                requestB.setVehicleType(Integer.valueOf(typeOfVehicle));
                requestB.setPolicyholder(certificateInfo.getPolicyholder());
                requestB.setPolicynumber(certificateInfo.getPolicynumber());
                requestB.setCommencingdate(certificateInfo.getCommencingdate());
                requestB.setExpiringdate(certificateInfo.getExpiringdate());
                requestB.setRegistrationnumber(Registrationnumber);
                requestB.setTonnageCarryingCapacity(Integer.valueOf(tonnageCapacity));
                requestB.setSumInsured(Integer.valueOf(Integer.parseInt(certificateInfo.getSumInsured())));
                requestB.setInsuredPIN(certificateInfo.getInsuredPIN());
                requestB.setYearofmanufacture(Integer.valueOf(yom));
                requestB.setChassisnumber(certificateInfo.getChassisnumber());
                requestB.setEmail(certificateInfo.getEmail());
                requestB.setPhonenumber(certificateInfo.getPhonenumber());
                requestB.setBodytype(certificateInfo.getBodytype());
                requestB.setVehiclemake(certificateInfo.getVehiclemake());
                requestB.setVehiclemodel(certificateInfo.getVehiclemodel());
                requestB.setIntermediaryIRANumber(certificateInfo.getIntermediaryIRANumber());
                try {
                    final IssuanceTypeBResponse resB = UwServiceImpl.service.issueTypeBCertificate(requestB, akiconnClientID, String.format("%s%s", akiproceURL, "IssuanceTypeBCertificate"));
                    if (null != resB && resB.getSuccess()) {
                        final com.turnkeyafrica.dmvic.certtypes.typeb.response.IssueCertificate issuedCertificate2 = resB.getIssuanceTypeBResponseCallbackObj().getIssueCertificate();
                        msg = "5Aki Electronic Cert Successfully Allocated";
                        status_desc = "Aki Electronic Cert Successfully Allocated";
                        actualCNo = issuedCertificate2.getActualCNo();
                        certificateResponse.setMessage(status_desc);
                        certificateResponse.setRiskId(certificateInfo.getRegNo());
                        certificateResponse.setPolicyNo(certificateInfo.getPolicynumber());
                        certificateResponse.setActualCNo(actualCNo);
                        certificateResponse.setTransactionNo(issuedCertificate2.getTransactionNo());
                        certificateResponse.setRequestNumber(resB.getAPIRequestNumber());
                    }
                    else if (null != resB && resB.getError().size() > 0) {
                        final List<AkiError> errorsB = (List<AkiError>)resB.getError();
                        String err2 = "";
                        for (int j = 0; j < errorsB.size(); ++j) {
                            err2 = err2.concat(String.format("%s - %s %s", errorsB.get(j).getErrorCode(), errorsB.get(j).getErrorText(), "\n"));
                            certificateResponse.setMessage(err2);
                            certificateResponse.setRiskId(certificateInfo.getRegNo());
                            certificateResponse.setPolicyNo(certificateInfo.getPolicynumber());
                        }
                        GlobalCC.INFORMATIONREPORTING(err2);
                    }
                }
                catch (Exception e2) {
                    GlobalCC.EXCEPTIONREPORTING(e2);
                }
                break;
            }
            case 3: {
                final IssuanceTypeCRequest requestC = new IssuanceTypeCRequest();
                requestC.setTypeofcover(Integer.valueOf(akiTypeofcover));
                requestC.setPolicyholder(certificateInfo.getPolicyholder());
                requestC.setPolicynumber(certificateInfo.getPolicynumber());
                requestC.setCommencingdate(certificateInfo.getCommencingdate());
                requestC.setExpiringdate(certificateInfo.getExpiringdate());
                requestC.setRegistrationnumber(Registrationnumber);
                requestC.setSumInsured(Integer.valueOf(Integer.parseInt(certificateInfo.getSumInsured())));
                requestC.setInsuredPIN(certificateInfo.getInsuredPIN());
                requestC.setYearofmanufacture(Integer.valueOf(yom));
                requestC.setChassisnumber(certificateInfo.getChassisnumber());
                requestC.setEmail(certificateInfo.getEmail());
                requestC.setPhonenumber(certificateInfo.getPhonenumber());
                requestC.setBodytype(certificateInfo.getBodytype());
                requestC.setVehiclemake(certificateInfo.getVehiclemake());
                requestC.setVehiclemodel(certificateInfo.getVehiclemodel());
                requestC.setIntermediaryIRANumber(certificateInfo.getIntermediaryIRANumber());
                try {
                    final IssuanceTypeCResponse resC = UwServiceImpl.service.issueTypeCCertificate(requestC, akiconnClientID, String.format("%s%s", akiproceURL, "IssuanceTypeCCertificate"));
                    if (null != resC && resC.getSuccess()) {
                        final com.turnkeyafrica.dmvic.certtypes.typec.response.IssueCertificate issuedCertificate3 = resC.getIssuanceTypeCResponseCallbackObj().getIssueCertificate();
                        msg = "5Aki Electronic Cert Successfully Allocated";
                        status_desc = "Aki Electronic Cert Successfully Allocated";
                        actualCNo = issuedCertificate3.getActualCNo();
                        certificateResponse.setMessage(status_desc);
                        certificateResponse.setRiskId(certificateInfo.getRegNo());
                        certificateResponse.setPolicyNo(certificateInfo.getPolicynumber());
                        certificateResponse.setActualCNo(actualCNo);
                        certificateResponse.setTransactionNo(issuedCertificate3.getTransactionNo());
                        certificateResponse.setRequestNumber(resC.getAPIRequestNumber());
                    }
                    else if (null != resC && resC.getError().size() > 0) {
                        final List<AkiError> errorsC = (List<AkiError>)resC.getError();
                        String err3 = "";
                        for (int k = 0; k < errorsC.size(); ++k) {
                            err3 = err3.concat(String.format("%s - %s %s", errorsC.get(k).getErrorCode(), errorsC.get(k).getErrorText(), "\n"));
                        }
                        certificateResponse.setMessage(err3);
                        certificateResponse.setRiskId(certificateInfo.getRegNo());
                        certificateResponse.setPolicyNo(certificateInfo.getPolicynumber());
                        GlobalCC.INFORMATIONREPORTING(err3);
                    }
                }
                catch (Exception e3) {
                    GlobalCC.EXCEPTIONREPORTING(e3);
                }
                break;
            }
            case 4: {
                final IssuanceTypeDRequest requestD = new IssuanceTypeDRequest();
                requestD.setTypeOfCertificate(Integer.valueOf(certificateType));
                requestD.setTypeofcover(Integer.valueOf(akiTypeofcover));
                requestD.setPolicyholder(certificateInfo.getPolicyholder());
                requestD.setPolicynumber(certificateInfo.getPolicynumber());
                requestD.setCommencingdate(certificateInfo.getCommencingdate());
                requestD.setExpiringdate(certificateInfo.getExpiringdate());
                requestD.setRegistrationnumber(Registrationnumber);
                requestD.setChassisnumber(certificateInfo.getChassisnumber());
                if (certificateType == 9) {
                    int carryCapacity = 0;
                    if (certificateInfo.getLicensedtocarry() != null) {
                        if (certificateInfo.getLicensedtocarry().toString().length() != 0) {
                            carryCapacity = Integer.valueOf(certificateInfo.getLicensedtocarry());
                        }
                    }
                    requestD.setLicensedtocarry(Integer.valueOf(carryCapacity));
                }
                if (certificateType == 9) {
                    requestD.setTonnage(Integer.valueOf(tonnageCapacity));
                }
                requestD.setSumInsured(Integer.valueOf(Integer.parseInt(certificateInfo.getSumInsured())));
                requestD.setInsuredPIN(certificateInfo.getInsuredPIN());
                requestD.setYearofmanufacture(Integer.valueOf(yom));
                requestD.setEmail(certificateInfo.getEmail());
                requestD.setPhonenumber(certificateInfo.getPhonenumber());
                requestD.setBodytype(certificateInfo.getBodytype());
                requestD.setVehiclemake(certificateInfo.getVehiclemake());
                requestD.setVehiclemodel(certificateInfo.getVehiclemodel());
                requestD.setIntermediaryIRANumber(certificateInfo.getIntermediaryIRANumber());
                try {
                    final IssuanceTypeDResponse resD = UwServiceImpl.service.issueTypeDCertificate(requestD, akiconnClientID, String.format("%s%s", akiproceURL, "IssuanceTypeDCertificate"));
                    if (null != resD && resD.getSuccess()) {
                        final com.turnkeyafrica.dmvic.certtypes.typed.response.IssueCertificate issuedCertificate4 = resD.getIssuanceTypeDResponseCallbackObj().getIssueCertificate();
                        msg = "5Aki Electronic Cert Successfully Allocated";
                        status_desc = "Aki Electronic Cert Successfully Allocated";
                        actualCNo = issuedCertificate4.getActualCNo();
                        certificateResponse.setMessage(status_desc);
                        certificateResponse.setRiskId(certificateInfo.getRegNo());
                        certificateResponse.setPolicyNo(certificateInfo.getPolicynumber());
                        certificateResponse.setActualCNo(actualCNo);
                        certificateResponse.setTransactionNo(issuedCertificate4.getTransactionNo());
                        certificateResponse.setRequestNumber(resD.getAPIRequestNumber());
                    }
                    else if (null != resD && resD.getError().size() > 0) {
                        final List<AkiError> errorsD = (List<AkiError>)resD.getError();
                        String err4 = "";
                        for (int l = 0; l < errorsD.size(); ++l) {
                            err4 = err4.concat(String.format("%s - %s %s", errorsD.get(l).getErrorCode(), errorsD.get(l).getErrorText(), "\n"));
                        }
                        certificateResponse.setMessage(err4);
                        GlobalCC.INFORMATIONREPORTING(err4);
                    }
                }
                catch (Exception e4) {
                    GlobalCC.EXCEPTIONREPORTING(e4);
                }
                break;
            }
        }
        return certificateResponse;
    }
    
    public String replaceNullValues(final String item) {
        if (item == null) {
            return "";
        }
        return item;
    }
    
    public String authenticateAkiApis() {
        String success = "N";
        String akiauthUsername = null;
        String akiauthPassword = null;
        String akiauthURL = null;
        final GlobalCC globalCC = new GlobalCC();
        try {
            akiauthUsername = GlobalCC.getGisSysParamValue("AKI_API_AUTHUSERNAME");
            akiauthPassword = GlobalCC.getGisSysParamValue("AKI_API_AUTHKEY");
            akiauthURL = GlobalCC.getGisSysParamValue("AKI_API_AUTHURL");
            UwServiceImpl.service = new AuthenticationService();
            (this.request = new LoginRequest()).setUsername(akiauthUsername);
            this.request.setPassword(akiauthPassword);
            final DateFormat utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
            utcFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            UwServiceImpl.loginResponse = UwServiceImpl.service.doLogin(this.request, akiauthURL);
            System.out.println(UwServiceImpl.loginResponse);
            if (utcFormat.parse(UwServiceImpl.loginResponse.getExpires()).getTime() < System.currentTimeMillis()) {
                UwServiceImpl.loginResponse = UwServiceImpl.service.doLogin(this.request, akiauthURL);
            }
            success = "Y";
        }
        catch (Exception pe) {
            pe.printStackTrace();
        }
        return success;
    }
    
    public List<PaymentConfirmationResponse> checkPaymentTransactions(final PaymentConfirmationRequest paymentConfirmationRequest) {
        Connection conn = null;
        final JdbcTemplate jdbcTemplate2 = (JdbcTemplate)BeanUtil.getBean((Class)JdbcTemplate.class);
        PreparedStatement pst = null;
        ResultSet rst = null;
        final String regNo = null;
        final List<PaymentConfirmationResponse> confirmationResponses = new ArrayList<PaymentConfirmationResponse>();
        try {
            conn = jdbcTemplate2.getDataSource().getConnection();
            String query = "SELECT IOPL_TRANS_CODE mpesa_ref, \nIOPL_ACCNUMBER barcode, \nIOPL_TRANS_AMT amt, \nIOPL_SENDER received_from, \nIOPL_SOURCE_REF phone_number, \nIOPL_DATE received_date, \nIOPL_RECEIPT_NO receipt_no \nFROM giN_WEB_payments \nWHERE IOPL_ACCNUMBER = :v_transmittalNo \nORDER BY IOPL_TRX_DATE DESC";
            query = query.replaceAll(":v_transmittalNo", (paymentConfirmationRequest.getTransmittalNo() != null) ? ("'" + paymentConfirmationRequest.getTransmittalNo() + "'") : "null");
            pst = conn.prepareStatement(query);
            rst = pst.executeQuery();
            if (rst.next()) {
                final PaymentConfirmationResponse paymentConfirmationResponse = new PaymentConfirmationResponse();
                paymentConfirmationResponse.setMpesaRef(this.replaceNullValues(rst.getString(1)));
                paymentConfirmationResponse.setTransmittalNo(this.replaceNullValues(rst.getString(2)));
                paymentConfirmationResponse.setAmount(this.replaceNullValues(rst.getString(3)));
                paymentConfirmationResponse.setReceivedFrom(this.replaceNullValues(rst.getString(4)));
                paymentConfirmationResponse.setPhoneNumber(this.replaceNullValues(rst.getString(5)));
                paymentConfirmationResponse.setReceivedDate(this.replaceNullValues(rst.getString(6)));
                paymentConfirmationResponse.setReceiptNo(this.replaceNullValues(rst.getString(7)));
                confirmationResponses.add(paymentConfirmationResponse);
            }
        }
        catch (Exception ex) {}
        return confirmationResponses;
    }
    
    public String insertCertificateDetails(final CertificateInfo certificateInfo, final CertificateResponse certificateResponse) {
        Connection conn = null;
        final JdbcTemplate jdbcTemplate2 = (JdbcTemplate)BeanUtil.getBean((Class)JdbcTemplate.class);
        CallableStatement cst = null;
        final PreparedStatement pst = null;
        ResultSet rst = null;
        final String response = "";
        final String cancelCert = "N";
        try {
            final SimpleDateFormat dateFormatter2 = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date formwef = null;
            Date sqlwef = null;
            final String wef = certificateInfo.getCommencingdate();
            final String wet = certificateInfo.getExpiringdate();
            try {
                if (wef != null) {
                    formwef = dateFormatter2.parse(wef);
                    sqlwef = new Date(formwef.getTime());
                }
            }
            catch (Exception ex) {}
            java.util.Date formwet = null;
            Date sqlwet = null;
            try {
                if (wet != null) {
                    formwet = dateFormatter2.parse(wet);
                    sqlwet = new Date(formwet.getTime());
                }
            }
            catch (Exception ex2) {}
            conn = jdbcTemplate2.getDataSource().getConnection();
            final String dataSetsQuery = "SELECT GIN_GPES_CODE_SEQ.NEXTVAL FROM DUAL";
            PreparedStatement seqStatement2 = null;
            seqStatement2 = conn.prepareStatement(dataSetsQuery);
            rst = seqStatement2.executeQuery();
            int intSeq2 = 0;
            while (rst.next()) {
                intSeq2 = rst.getInt(1);
            }
            final String insertQuery = "Insert into TQ_GIS.GIN_AKI_POLICY_CERT_DTLS \n(APCD_CODE, APCD_IPU_CODE, APCD_POL_BATCH_NO, APCD_POL_POLICY_NO, APCD_POL_REN_ENDOS_NO,  \nAPCD_CER_CERT_NO, APCD_VALIDATED, APCD_CERT_ALLOCATED, APCD_CERT_CANCELLED, APCD_CER_VALIDATION_RMKS,  \nAPCD_CER_ALLOCATION_RMKS, APCD_TRANS_NO, APCD_REQUEST_NUMBER, APCD_STATUS_DT, APCD_WEF,  \nAPCD_WET, APCD_CT_CODE, APCD_CT_SHT_DESC, APCD_PROPERTY_ID, APCD_ISSUE_DT,  \nAPCD_ISSUED_BY, APCD_LOADED) \nValues \n(?, ?, ?, ?, ?,?,  \n'Y', 'Y', 'N', 'Transaction Successfully Validated', 'Aki Electronic Cert Successfully Allocated', \n?, ?, SYSDATE, ?,  \n?, ?, ?, ?, SYSDATE,  \n'API USER', 'N')";
            cst = conn.prepareCall(insertQuery);
            cst.setInt(1, intSeq2);
            cst.setBigDecimal(2, certificateInfo.getIpuCode());
            cst.setBigDecimal(3, certificateInfo.getBatchNo());
            cst.setString(4, certificateInfo.getPolicynumber());
            cst.setString(5, certificateInfo.getEndorseNo());
            cst.setString(6, certificateResponse.getActualCNo());
            cst.setString(7, certificateResponse.getTransactionNo());
            cst.setString(8, certificateResponse.getRequestNumber());
            cst.setObject(9, sqlwef);
            cst.setObject(10, sqlwet);
            cst.setBigDecimal(11, certificateInfo.getCtCode());
            cst.setString(12, certificateInfo.getCtShtDesc());
            cst.setString(13, certificateInfo.getRegNo());
            cst.execute();
            conn.close();
            cst.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            DbUtils.closeQuietly(conn, (Statement)pst, rst);
        }
        return null;
    }
    
    public String checkScheduleCompatibility(final String agnShtDesc) {
        Connection conn = null;
        final JdbcTemplate jdbcTemplate2 = (JdbcTemplate)BeanUtil.getBean((Class)JdbcTemplate.class);
        PreparedStatement pst = null;
        ResultSet rst = null;
        String schCompatible = null;
        try {
            conn = jdbcTemplate2.getDataSource().getConnection();
            String query = "SELECT NVL(AGN_WEB_SCH_COMPATIBLE,'N')AGN_WEB_SCH_COMPATIBLE \nFROM TQ_CRM.TQC_AGENCIES \nWHERE AGN_SHT_DESC = :v_agn_sht_desc";
            query = query.replaceAll(":v_agn_sht_desc", (agnShtDesc != null) ? ("'" + agnShtDesc + "'") : "null");
            pst = conn.prepareStatement(query);
            rst = pst.executeQuery();
            if (rst.next()) {
                schCompatible = rst.getString(1);
            }
        }
        catch (Exception ex) {}
        return schCompatible;
    }
    
    public String validatePaymentTransactions(final String transmitalNo, final BigDecimal premium, final String policyNo) {
        Connection conn = null;
        final JdbcTemplate jdbcTemplate2 = (JdbcTemplate)BeanUtil.getBean((Class)JdbcTemplate.class);
        PreparedStatement pst = null;
        ResultSet rst = null;
        String paymentProcessed = null;
        String mpesaRef = null;
        try {
            conn = jdbcTemplate2.getDataSource().getConnection();
            String query = "SELECT IOPL_TRANS_CODE mpesa_ref, \nIOPL_ACCNUMBER barcode, \nIOPL_TRANS_AMT amt, \nIOPL_SENDER received_from, \nIOPL_SOURCE_REF phone_number, \nIOPL_DATE received_date, \nIOPL_RECEIPT_NO receipt_no \nFROM giN_WEB_payments \nWHERE IOPL_ACCNUMBER = :v_transmittalNo \nAND IOPL_TRANS_AMT > :v_premium \nAND IOPL_ACCNUMBER in(select GGTS_IPAY_REF_NO from GIN_GIS_TRANSMITALS where GGTS_IPAY_REF_NO=IOPL_ACCNUMBER and GGTS_POL_POLICY_NO=:v_policy_no ) \nORDER BY IOPL_TRX_DATE DESC";
            query = query.replaceAll(":v_transmittalNo", (transmitalNo != null) ? ("'" + transmitalNo + "'") : "null");
            query = query.replaceAll(":v_premium", (premium != null) ? ("'" + premium + "'") : "null");
            query = query.replaceAll(":v_policy_no", (policyNo != null) ? ("'" + policyNo + "'") : "null");
            pst = conn.prepareStatement(query);
            rst = pst.executeQuery();
            if (rst.next()) {
                mpesaRef = rst.getString(1);
            }
            if (mpesaRef == null || mpesaRef.toString().length() == 0) {
                paymentProcessed = "N";
            }
            else {
                paymentProcessed = "Y";
            }
        }
        catch (Exception ex) {}
        return paymentProcessed;
    }
    
    public String checkCreditPolicyStatus(final String agnShtDesc) {
        Connection conn = null;
        final JdbcTemplate jdbcTemplate2 = (JdbcTemplate)BeanUtil.getBean((Class)JdbcTemplate.class);
        PreparedStatement pst = null;
        ResultSet rst = null;
        String excepted = null;
        try {
            conn = jdbcTemplate2.getDataSource().getConnection();
            String query = "SELECT NVL(AGN_WEB_CREDIT_POL_EXEMPTED,'N')AGN_WEB_CREDIT_POL_EXEMPTED \nFROM TQ_CRM.TQC_AGENCIES \nWHERE AGN_SHT_DESC = :v_agn_sht_desc";
            query = query.replaceAll(":v_agn_sht_desc", (agnShtDesc != null) ? ("'" + agnShtDesc + "'") : "null");
            pst = conn.prepareStatement(query);
            rst = pst.executeQuery();
            if (rst.next()) {
                excepted = rst.getString(1);
            }
        }
        catch (Exception ex) {}
        return excepted;
    }
    
    public UwServiceImpl(final JdbcTemplate jdbcTemplate2, final NamedParameterJdbcTemplate jdbcTemplate, final PolicyRepository policyRepository, final RiskRepository riskRepository, final ClientRepository clientRepository, final InsuredLimitsRepository insuredLimitsRepository, final DocumentRepository documentRepository, final MasterRiskDtlRepository masterRiskDtlRepository, final AmlRepository amlRepository, final ObjectMapper objectMapper) {
        this.jdbcTemplate2 = jdbcTemplate2;
        this.jdbcTemplate = jdbcTemplate;
        this.policyRepository = policyRepository;
        this.riskRepository = riskRepository;
        this.clientRepository = clientRepository;
        this.insuredLimitsRepository = insuredLimitsRepository;
        this.documentRepository = documentRepository;
        this.masterRiskDtlRepository = masterRiskDtlRepository;
        this.amlRepository = amlRepository;
        this.objectMapper = objectMapper;
    }
    
    static {
        log = LoggerFactory.getLogger((Class)UwServiceImpl.class);
    }
}
