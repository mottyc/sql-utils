SELECT	@RequestByPersonID = p.ID,
				@EmployeeId = emp.ID,
				@PositionId = pos.ID,
				@RequestByServiceProviderChannelId = spc.ID
		FROM	dbo.T0071_Referrals AS ref
				INNER JOIN dbo.T0001_Person AS p ON ref.ServiceProviderID = p.IdentificationNumber COLLATE database_default
				INNER JOIN dbo.T0003_Employee AS emp ON p.ID = emp.PersonId AND ref.ReferralDate BETWEEN emp.BeginDate AND emp.EndDate AND emp.EmployeeStatus = 1
				INNER JOIN dbo.T0004_Position AS pos ON ref.PositionId = pos.HcmObjectId AND ref.ReferralDate BETWEEN pos.BeginDate AND pos.EndDate
				INNER JOIN dbo.T0022_PositionEmployee AS pe ON pe.PositionId = pos.ID AND pe.EmployeeId = emp.ID AND ref.ReferralDate BETWEEN pe.BeginDate AND pe.EndDate
				INNER JOIN dbo.T0023_ServiceProviderChannel AS spc ON pos.ID = spc.EntityID AND spc.EntityType = 4 AND spc.EmployeeId = emp.ID
				INNER JOIN dbo.T0005_OrgUnit AS ou ON ou.ID = dbo.GetServiceOrgUnit(pos.ID, ref.ReferralDate) AND ref.ReferralDate BETWEEN ou.BeginDate AND ou.EndDate
		WHERE	ref.ReferralID = @OrderCode;