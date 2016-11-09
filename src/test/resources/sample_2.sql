			"select * from\n" +
					"FactInternetSales s left join dbo.DimProduct p on (s.productkey = p.productkey and s.promokey = p.eyal)\n" +
					"where currencykey = 100 and p.productkey = 214",

			"select * from \n" +
					"dbo.FactInternetSales , dbo.DimProduct \n" +
					"where FactInternetSales.productkey = DimProduct.productkey and promokey = eyal\n" +
					"and currencykey = 100 and DimProduct.productkey = 214\n",

			"select * from \n" +
					"dbo.FactInternetSales  left join dbo.DimProduct  on (FactInternetSales.productkey = DimProduct.productkey and FactInternetSales.promokey = DimProduct.eyal)\n" +
					"where currencykey = 100 and DimProduct.productkey = 214\n",

			"select * from \n" +
					"dbo.FactInternetSales as s , dbo.DimProduct as p\n" +
					"where s.productkey = p.productkey\n" +
					"and currencykey = 100 and p.productkey = 214",

			"select * from \n" +
					"[dbo].[FactInternetSales] as s , dbo.DimProduct as p\n" +
					"where s.productkey = p.productkey and s.promokey = p.eyal\n" +
					"and currencykey = 100 and p.productkey = 214"