/*
 * Copyright (c) 2016. dxplore.io SQL Utils
 */

package com.dxplore.utils;

import org.apache.commons.io.IOUtils;
import org.junit.*;

import java.io.InputStream;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by motty on 17/02/2016.
 */
public class ApplicationTest {


    private String[] tests = {
            "select * from\n" +
                    "FactInternetSales s left join dbo.DimProduct p on (s.productkey = p.productkey and s.promokey = p.eyal)\n" +
                    "where currencykey = 100 and p.productkey = 214;",

            "select * from \n" +
                    "dbo.FactInternetSales , dbo.DimProduct \n" +
                    "where FactInternetSales.productkey = DimProduct.productkey and promokey = eyal\n" +
                    "and currencykey = 100 and DimProduct.productkey = 214;\n",

            "select * from \n" +
                    "dbo.FactInternetSales  left outer join dbo.DimProduct  on (FactInternetSales.productkey = DimProduct.productkey and FactInternetSales.promokey = DimProduct.eyal)\n" +
                    "where currencykey = 100 and DimProduct.productkey = 214;\n",

            "select * from \n" +
                    "dbo.FactInternetSales as s , dbo.DimProduct as p\n" +
                    "where s.productkey = p.productkey\n" +
                    "and currencykey = 100 and p.productkey = 214;",

            "select * from \n" +
                    "[dbo].[FactInternetSales] as s , dbo.DimProduct as p\n" +
                    "where s.productkey = p.productkey and s.promokey = p.eyal\n" +
                    "and currencykey = 100 and p.productkey = 214;"
    };

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    @Ignore
    public void testProcessComplexSql() throws Exception {

        String sql = "SELECT\t@RequestByPersonID = p.ID,\n" +
                "\t\t\t\t@EmployeeId = emp.ID,\n" +
                "\t\t\t\t@PositionId = pos.ID,\n" +
                "\t\t\t\t@RequestByServiceProviderChannelId = spc.ID\n" +
                "\t\tFROM\tdbo.T0071_Referrals AS ref\n" +
                "\t\t\t\tLEFT OUTER JOIN dbo.T0001_Person AS p ON ref.ServiceProviderID = p.IdentificationNumber COLLATE database_default\n" +
                "\t\t\t\tINNER JOIN dbo.T0003_Employee AS emp ON p.ID = emp.PersonId AND ref.ReferralDate BETWEEN emp.BeginDate AND emp.EndDate AND emp.EmployeeStatus = 1\n" +
                "\t\t\t\tINNER JOIN dbo.T0004_Position AS pos ON ref.PositionId = pos.HcmObjectId AND ref.ReferralDate BETWEEN pos.BeginDate AND pos.EndDate\n" +
                "\t\t\t\tINNER JOIN dbo.T0022_PositionEmployee AS pe ON pe.PositionId = pos.ID AND pe.EmployeeId = emp.ID AND ref.ReferralDate BETWEEN pe.BeginDate AND pe.EndDate\n" +
                "\t\t\t\tINNER JOIN dbo.T0023_ServiceProviderChannel AS spc ON pos.ID = spc.EntityID AND spc.EntityType = 4 AND spc.EmployeeId = emp.ID\n" +
                "\t\t\t\tINNER JOIN dbo.T0005_OrgUnit AS ou ON ou.ID = dbo.GetServiceOrgUnit(pos.ID, ref.ReferralDate) AND ref.ReferralDate BETWEEN ou.BeginDate AND ou.EndDate\n" +
                "\t\tWHERE\tref.ReferralID = @OrderCode;";

        this.testProcess(sql);
    }

    @Test
    @Ignore
    public void testProcessComplexSql2() throws Exception {

        String sql = "SELECT\t@RequestByPersonID = p.ID,\n" +
                "\t\t\t\t@EmployeeId = emp.ID,\n" +
                "\t\t\t\t@PositionId = pos.ID,\n" +
                "\t\t\t\t@RequestByServiceProviderChannelId = spc.ID\n" +
                "\t\tFROM\tdbo.T0071_Referrals AS ref\n" +
                "\t\t\t\tLEFT OUTER JOIN dbo.T0001_Person AS p ON ref.ServiceProviderID = p.IdentificationNumber COLLATE database_default\n" +
                "\t\t\t\tINNER JOIN dbo.T0003_Employee AS emp ON p.ID = emp.PersonId AND ref.ReferralDate BETWEEN emp.BeginDate AND emp.EndDate AND emp.EmployeeStatus = 1\n" +
                "\t\tWHERE\tref.ReferralID = @OrderCode;";

        this.testProcess(sql);
    }

    @Test
    @Ignore
    public void testProcessSimpleSql() throws Exception {
        this.testProcess(tests[3]);
    }

    @Test
    @Ignore
    public void testVeryComplexSql() throws Exception {
        String sql = "SELECT \n" +
                "T0053_Eligibility.ID, \n" +
                "T0052_ClinicalSession.SessionDatetime as EligibilityDatetime, \n" +
                "T0052_ClinicalSession.ID as ClinicalSessionId, \n" +
                "T0053_Eligibility.AscriptionReleaseTypeId, \n" +
                "T0053_Eligibility.QuarterlyAscriptionIndicator, \n" +
                "T0053_Eligibility.RecordStatus, \n" +
                "T0053_Eligibility.FirstInFiscalQuarter, \n" +
                "T0053_Eligibility.EligibilityType, \n" +
                "T0052_ClinicalSession.MemberID, \n" +
                "T0053_Eligibility.EligibilityExecutionDatetime, \n" +
                "T0053_Eligibility.FinalEligibilityResult, \n" +
                "T0053_Eligibility.CardIssueMonth, \n" +
                "T0053_Eligibility.LastUpdateDate,\n" +
                "T0053_Eligibility.UpdatedBy, \n" +
                "T0052_ClinicalSession.SessionDatetime, \n" +
                "T0052_ClinicalSession.ElligibilityOccupationId, \n" +
                "T0052_ClinicalSession.RecordStatus, \n" +
                "T0023_ServiceProviderChannel.EntityType, \n" +
                "T0023_ServiceProviderChannel.EntityId, \n" +
                "T0023_ServiceProviderChannel.EmployeeId, \n" +
                "T0055_Deductible.DeductibleType, \n" +
                "T0055_Deductible.EligibilityId, \n" +
                "T0055_Deductible.Amount, \n" +
                "T0055_Deductible.FirstIn90Days, \n" +
                "T0055_Deductible.RecordStatus, \n" +
                "T0055_Deductible.PaymentMethodCode, \n" +
                "T0055_Deductible.LastUpdateDate as T0055_LastUpdateDate,\n" +
                "T0056_Diagnosis.LastUpdateDate as T0056_LastUpdateDate,\n" +
                "T0061_MemberTreatment.LastUpdateDate as T0061_LastUpdateDate,\n" +
                "T0031_Occupation.HcmObjectId as HcmOccupationId,\n" +
                "T0031_Occupation_Eligibility.HcmObjectId as EligibilityHcmOccupationId\n" +
                "\n" +
                "FROM [CDS].[dbo].T0065_ExternalClinicalSession WITH(NOLOCK)\n" +
                "\n" +
                "INNER JOIN [CDS].[dbo].T0052_ClinicalSession WITH(NOLOCK)\n" +
                "ON T0052_ClinicalSession.ID = T0065_ExternalClinicalSession.ClinicalSessionId\n" +
                "AND T0052_ClinicalSession.MemberID is not null\n" +
                "\n" +
                "INNER JOIN [CDS].[dbo].T0023_ServiceProviderChannel WITH(NOLOCK)\n" +
                "ON T0023_ServiceProviderChannel.ID = T0052_ClinicalSession.ServiceProviderChannelId\n" +
                "\n" +
                "LEFT JOIN (\n" +
                "  SELECT [T0075_ServiceProviderEligibility].EligibilityDateTime,\n" +
                "         [T0075_ServiceProviderEligibility].ServiceProviderChannelId,\n" +
                "\t\t T0031_Occupation_Eligibility.HcmObjectId\n" +
                "    FROM [CDS].[dbo].[T0075_ServiceProviderEligibility] WITH(NOLOCK)\n" +
                "    LEFT JOIN [CDS].[dbo].[T0031_Occupation] as T0031_Occupation_Eligibility WITH(NOLOCK)\n" +
                "      ON T0031_Occupation_Eligibility.ID = [T0075_ServiceProviderEligibility].OccForEgilibilityCode\n" +
                ") as T0031_Occupation_Eligibility\n" +
                "ON T0031_Occupation_Eligibility.EligibilityDateTime = T0052_ClinicalSession.SessionDatetime\n" +
                "AND T0031_Occupation_Eligibility.ServiceProviderChannelId = T0052_ClinicalSession.ServiceProviderChannelId\n" +
                "\n" +
                "LEFT JOIN [CDS].[dbo].[T0053_Eligibility] with(nolock)\n" +
                "ON T0053_Eligibility.ClinicalSessionId = T0052_ClinicalSession.ID\n" +
                "AND NOT EXISTS (\n" +
                "  SELECT T0054_EligibilityResult.EntityId\n" +
                "    FROM [CDS].[dbo].T0054_EligibilityResult WITH(NOLOCK)\n" +
                "    JOIN [CDS].[dbo].T9023_EligibilityResultCode WITH(NOLOCK)\n" +
                "      on T9023_EligibilityResultCode.ResultCode = T0054_EligibilityResult.EligibilityResultCode\n" +
                "     and T9023_EligibilityResultCode.IsCritical = 1\n" +
                "    WHERE T0054_EligibilityResult.EntityId = [T0053_Eligibility].ID\n" +
                "      AND T0054_EligibilityResult.EntityType = 53 \n" +
                "\t  AND T0054_EligibilityResult.EligibilityResultCode <> 5300\n" +
                ")\n" +
                "\n" +
                "LEFT JOIN (\n" +
                "  SELECT ClinicalSessionId, max(LastUpdateDate) as LastUpdateDate\n" +
                "    FROM [CDS].[dbo].T0056_Diagnosis WITH(NOLOCK)\n" +
                "    WHERE LastUpdateDate > '02/14/2016 08:33:41'\n" +
                "    GROUP BY ClinicalSessionId\n" +
                ") as T0056_Diagnosis\n" +
                "ON T0056_Diagnosis.ClinicalSessionId = T0052_ClinicalSession.ID\n" +
                "\n" +
                "LEFT JOIN (\n" +
                "  SELECT ClinicalSessionId, max(LastUpdateDate) as LastUpdateDate\n" +
                "    FROM [CDS].[dbo].T0061_MemberTreatment WITH(NOLOCK)\n" +
                "    WHERE LastUpdateDate > '02/14/2016 08:33:41'\n" +
                "    GROUP BY ClinicalSessionId\n" +
                ") as T0061_MemberTreatment\n" +
                "ON T0061_MemberTreatment.ClinicalSessionId = T0052_ClinicalSession.ID\n" +
                "\n" +
                "OUTER APPLY ( SELECT T0031_Occupation.HcmObjectId as HcmObjectId\n" +
                "                FROM [CDS].[dbo].[T0021_PositionOccupation] as T0021_PositionOccupation WITH(NOLOCK)\n" +
                "\t\t\t\tJOIN [CDS].[dbo].[T0031_Occupation] as T0031_Occupation WITH(NOLOCK)\n" +
                "                  ON T0031_Occupation.ID = T0021_PositionOccupation.OccupationId \n" +
                "\t\t\t\tWHERE T0023_ServiceProviderChannel.EntityType = 4\n" +
                "\t\t\t\t  AND T0021_PositionOccupation.PositionId = T0023_ServiceProviderChannel.EntityId \n" +
                "\t\t\t\t  AND T0021_PositionOccupation.OccupationOrder = 1\n" +
                "\t\t\t      AND T0053_Eligibility.EligibilityDatetime BETWEEN T0021_PositionOccupation.BeginDate AND T0021_PositionOccupation.EndDate\n" +
                "             ) as T0031_Occupation\n" +
                "\n" +
                "OUTER APPLY ( SELECT TOP 1\n" +
                "                     T0055_Deductible.DeductibleType, \n" +
                "                     T0055_Deductible.EligibilityId, \n" +
                "                     T0055_Deductible.Amount, \n" +
                "                     T0055_Deductible.FirstIn90Days, \n" +
                "                     T0055_Deductible.RecordStatus, \n" +
                "                     T0055_Deductible.PaymentMethodCode,\n" +
                "                     T0055_Deductible.LastUpdateDate\n" +
                "                FROM [CDS].[dbo].T0055_Deductible WITH(NOLOCK)\n" +
                "\t\t\t\tWHERE T0055_Deductible.EligibilityId = T0053_Eligibility.ID\n" +
                "\t\t\t\torder by EligibilityId, LastUpdateDate desc\n" +
                "             ) as T0055_Deductible\n" +
                "\n" +
                "WHERE\n" +
                "T0065_ExternalClinicalSession.SystemId <> 34 \n" +
                "AND ( \n" +
                "(T0053_Eligibility.ID is not null and T0053_Eligibility.LastUpdateDate > '02/14/2016 08:33:41') \n" +
                "OR (T0056_Diagnosis.ClinicalSessionId is not null and T0056_Diagnosis.LastUpdateDate > '02/14/2016 08:33:41') \n" +
                "OR (T0061_MemberTreatment.ClinicalSessionId is not null and T0061_MemberTreatment.LastUpdateDate > '02/14/2016 08:33:41') \n" +
                "OR (T0055_Deductible.EligibilityId is not null and T0055_Deductible.LastUpdateDate > '02/14/2016 08:33:41') \n" +
                ")\n" +
                "ORDER BY T0053_Eligibility.ID";

        this.testProcess(sql);
    }


    /**
     * Execute the processor
     * @param sql
     * @throws Exception
     */
    private void testProcess(String sql) throws Exception {

        try {
            Application app = new Application();
            app.overrideDatabase("database");
            app.overrideTenant("tenant");
            app.overrideWorkers("1");

            System.out.println(sql);
            System.out.println();
            app.processString(sql);
            System.out.println("Done");

            Assert.assertTrue("This should be true", false);

        } catch (Exception ex) {
            Assert.fail(ex.getMessage());
        }
    }
}