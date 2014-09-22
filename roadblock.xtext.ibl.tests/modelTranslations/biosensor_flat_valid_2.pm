ctmc

module PRISMModel

	//*******************
	// molecular species
	//*******************
	site1_SA : [0..60000] init 60000;
	site1_myCell_ribosome : [0..1] init 0;
	site1_myCell_rnaP : [0..1] init 0;
	site1_myCell_SA : [0..60000] init 60000;
	site1_myCell_PnahR : [0..1] init 1;
	site1_myCell_nahR : [0..1] init 1;
	site1_myCell_NahR : [0..1] init 0;
	site1_myCell_Psal : [0..1] init 1;
	site1_myCell_xylS2 : [0..1] init 1;
	site1_myCell_XylS2 : [0..1] init 0;
	site1_myCell_Pm : [0..1] init 1;
	site1_myCell_rFP : [0..1] init 1;
	site1_myCell_RFP : [0..1] init 0;
	site1_myCell_PlasR : [0..1] init 1;
	site1_myCell_lasR : [0..1] init 1;
	site1_myCell_gFP : [0..1] init 1;
	site1_myCell_LasR : [0..1] init 0;
	site1_myCell_GFP : [0..1] init 0;
	site1_myCell_AHL : [0..1] init 0;
	site1_myCell_SA_site1_myCell_XylS2 : [0..1] init 0;
	site1_myCell_AHL_site1_myCell_LasR : [0..1] init 0;
	site1_myCell_NahRLasRProduction_mrna1 : [0..1] init 0;
	site1_myCell_PnahR_site1_myCell_rnaP : [0..1] init 0;
	site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome : [0..1] init 0;
	site1_myCell_XylS2Production_mrna1 : [0..1] init 0;
	site1_myCell_SA_site1_myCell_NahR : [0..1] init 0;
	site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal : [0..1] init 0;
	site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal_site1_myCell_rnaP : [0..1] init 0;
	site1_myCell_XylS2Production_mrna1_site1_myCell_ribosome : [0..1] init 0;
	site1_myCell_GFPProduction_mrna1 : [0..1] init 0;
	site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm : [0..1] init 0;
	site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm_site1_myCell_rnaP : [0..1] init 0;
	site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR : [0..1] init 0;
	site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR_site1_myCell_rnaP : [0..1] init 0;
	site1_myCell_GFPProduction_mrna1_site1_myCell_ribosome : [0..1] init 0;

	//*******************
	// rules
	//*******************
	[] site1_myCell_SA > 0 & site1_myCell_XylS2 > 0 -> 1.0 : (site1_myCell_SA' = site1_myCell_SA - 1) & (site1_myCell_XylS2' = site1_myCell_XylS2 - 1) & (site1_myCell_SA_site1_myCell_XylS2' = site1_myCell_SA_site1_myCell_XylS2 + 1);
	[] site1_myCell_SA_site1_myCell_XylS2 > 0 -> 1.0 : (site1_myCell_SA_site1_myCell_XylS2' = site1_myCell_SA_site1_myCell_XylS2 - 1) & (site1_myCell_SA' = site1_myCell_SA + 1) & (site1_myCell_XylS2' = site1_myCell_XylS2 + 1);
	[] site1_myCell_AHL > 0 & site1_myCell_LasR > 0 -> 1.0 : (site1_myCell_AHL' = site1_myCell_AHL - 1) & (site1_myCell_LasR' = site1_myCell_LasR - 1) & (site1_myCell_AHL_site1_myCell_LasR' = site1_myCell_AHL_site1_myCell_LasR + 1);
	[] site1_myCell_AHL_site1_myCell_LasR > 0 -> 1.0 : (site1_myCell_AHL_site1_myCell_LasR' = site1_myCell_AHL_site1_myCell_LasR - 1) & (site1_myCell_AHL' = site1_myCell_AHL + 1) & (site1_myCell_LasR' = site1_myCell_LasR + 1);
	[] site1_SA > 0 -> 0.016666666666666666 : (site1_SA' = site1_SA - 1) & (site1_myCell_SA' = site1_myCell_SA + 1);
	[] true -> 0.016666666666666666 : (site1_myCell_AHL' = site1_myCell_AHL + 1);
	[] site1_myCell_PnahR > 0 & site1_myCell_rnaP > 0 -> 1.0 : (site1_myCell_rnaP' = site1_myCell_rnaP - 1) & (site1_myCell_PnahR' = site1_myCell_PnahR - 1) & (site1_myCell_PnahR_site1_myCell_rnaP' = site1_myCell_PnahR_site1_myCell_rnaP + 1);
	[] site1_myCell_PnahR_site1_myCell_rnaP > 0 -> 1.0 : (site1_myCell_PnahR_site1_myCell_rnaP' = site1_myCell_PnahR_site1_myCell_rnaP - 1) & (site1_myCell_rnaP' = site1_myCell_rnaP + 1) & (site1_myCell_PnahR' = site1_myCell_PnahR + 1);
	[] site1_myCell_PnahR_site1_myCell_rnaP > 0 -> 1.0 : (site1_myCell_NahRLasRProduction_mrna1' = site1_myCell_NahRLasRProduction_mrna1 + 1);
	[] site1_myCell_NahRLasRProduction_mrna1 > 0 -> 1.0 : (site1_myCell_NahRLasRProduction_mrna1' = site1_myCell_NahRLasRProduction_mrna1 - 1);
	[] site1_myCell_ribosome > 0 & site1_myCell_NahRLasRProduction_mrna1 > 0 -> 1.0 : (site1_myCell_ribosome' = site1_myCell_ribosome - 1) & (site1_myCell_NahRLasRProduction_mrna1' = site1_myCell_NahRLasRProduction_mrna1 - 1) & (site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome' = site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome + 1);
	[] site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome > 0 -> 1.0 : (site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome' = site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome - 1) & (site1_myCell_ribosome' = site1_myCell_ribosome + 1) & (site1_myCell_NahRLasRProduction_mrna1' = site1_myCell_NahRLasRProduction_mrna1 + 1);
	[] site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome > 0 -> 1.0 : (site1_myCell_NahR' = site1_myCell_NahR + 1);
	[] site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome > 0 -> 1.0 : (site1_myCell_LasR' = site1_myCell_LasR + 1);
	[] site1_myCell_PnahR > 0 & site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_rnaP' = site1_myCell_rnaP - 1) & (site1_myCell_PnahR' = site1_myCell_PnahR - 1) & (site1_myCell_PnahR_site1_myCell_rnaP' = site1_myCell_PnahR_site1_myCell_rnaP + 1);
	[] site1_myCell_PnahR_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_PnahR_site1_myCell_rnaP' = site1_myCell_PnahR_site1_myCell_rnaP - 1) & (site1_myCell_rnaP' = site1_myCell_rnaP + 1) & (site1_myCell_PnahR' = site1_myCell_PnahR + 1);
	[] site1_myCell_PnahR_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_NahRLasRProduction_mrna1' = site1_myCell_NahRLasRProduction_mrna1 + 1);
	[] site1_myCell_NahRLasRProduction_mrna1 > 0 -> 0.0 : (site1_myCell_NahRLasRProduction_mrna1' = site1_myCell_NahRLasRProduction_mrna1 - 1);
	[] site1_myCell_ribosome > 0 & site1_myCell_NahRLasRProduction_mrna1 > 0 -> 0.0 : (site1_myCell_ribosome' = site1_myCell_ribosome - 1) & (site1_myCell_NahRLasRProduction_mrna1' = site1_myCell_NahRLasRProduction_mrna1 - 1) & (site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome' = site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome + 1);
	[] site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome' = site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome - 1) & (site1_myCell_ribosome' = site1_myCell_ribosome + 1) & (site1_myCell_NahRLasRProduction_mrna1' = site1_myCell_NahRLasRProduction_mrna1 + 1);
	[] site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_NahR' = site1_myCell_NahR + 1);
	[] site1_myCell_NahRLasRProduction_mrna1_site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_LasR' = site1_myCell_LasR + 1);
	[] site1_myCell_Psal > 0 & site1_myCell_SA_site1_myCell_NahR > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_NahR' = site1_myCell_SA_site1_myCell_NahR - 1) & (site1_myCell_Psal' = site1_myCell_Psal - 1) & (site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal' = site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal + 1);
	[] site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal' = site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal - 1) & (site1_myCell_SA_site1_myCell_NahR' = site1_myCell_SA_site1_myCell_NahR + 1) & (site1_myCell_Psal' = site1_myCell_Psal + 1);
	[] site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal > 0 & site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal' = site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal - 1) & (site1_myCell_rnaP' = site1_myCell_rnaP - 1) & (site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal_site1_myCell_rnaP' = site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal_site1_myCell_rnaP + 1);
	[] site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal_site1_myCell_rnaP' = site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal_site1_myCell_rnaP - 1) & (site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal' = site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal + 1) & (site1_myCell_rnaP' = site1_myCell_rnaP + 1);
	[] site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_XylS2Production_mrna1' = site1_myCell_XylS2Production_mrna1 + 1);
	[] site1_myCell_XylS2Production_mrna1 > 0 -> 0.0 : (site1_myCell_XylS2Production_mrna1' = site1_myCell_XylS2Production_mrna1 - 1);
	[] site1_myCell_XylS2Production_mrna1 > 0 & site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_XylS2Production_mrna1' = site1_myCell_XylS2Production_mrna1 - 1) & (site1_myCell_ribosome' = site1_myCell_ribosome - 1) & (site1_myCell_XylS2Production_mrna1_site1_myCell_ribosome' = site1_myCell_XylS2Production_mrna1_site1_myCell_ribosome + 1);
	[] site1_myCell_XylS2Production_mrna1_site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_XylS2Production_mrna1_site1_myCell_ribosome' = site1_myCell_XylS2Production_mrna1_site1_myCell_ribosome - 1) & (site1_myCell_XylS2Production_mrna1' = site1_myCell_XylS2Production_mrna1 + 1) & (site1_myCell_ribosome' = site1_myCell_ribosome + 1);
	[] site1_myCell_XylS2Production_mrna1_site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_XylS2' = site1_myCell_XylS2 + 1);
	[] site1_myCell_Psal > 0 & site1_myCell_SA_site1_myCell_NahR > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_NahR' = site1_myCell_SA_site1_myCell_NahR - 1) & (site1_myCell_Psal' = site1_myCell_Psal - 1) & (site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal' = site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal + 1);
	[] site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal' = site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal - 1) & (site1_myCell_SA_site1_myCell_NahR' = site1_myCell_SA_site1_myCell_NahR + 1) & (site1_myCell_Psal' = site1_myCell_Psal + 1);
	[] site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal > 0 & site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal' = site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal - 1) & (site1_myCell_rnaP' = site1_myCell_rnaP - 1) & (site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal_site1_myCell_rnaP' = site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal_site1_myCell_rnaP + 1);
	[] site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal_site1_myCell_rnaP' = site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal_site1_myCell_rnaP - 1) & (site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal' = site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal + 1) & (site1_myCell_rnaP' = site1_myCell_rnaP + 1);
	[] site1_myCell_SA_site1_myCell_NahR_site1_myCell_Psal_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_XylS2Production_mrna1' = site1_myCell_XylS2Production_mrna1 + 1);
	[] site1_myCell_XylS2Production_mrna1 > 0 -> 0.0 : (site1_myCell_XylS2Production_mrna1' = site1_myCell_XylS2Production_mrna1 - 1);
	[] site1_myCell_XylS2Production_mrna1 > 0 & site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_XylS2Production_mrna1' = site1_myCell_XylS2Production_mrna1 - 1) & (site1_myCell_ribosome' = site1_myCell_ribosome - 1) & (site1_myCell_XylS2Production_mrna1_site1_myCell_ribosome' = site1_myCell_XylS2Production_mrna1_site1_myCell_ribosome + 1);
	[] site1_myCell_XylS2Production_mrna1_site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_XylS2Production_mrna1_site1_myCell_ribosome' = site1_myCell_XylS2Production_mrna1_site1_myCell_ribosome - 1) & (site1_myCell_XylS2Production_mrna1' = site1_myCell_XylS2Production_mrna1 + 1) & (site1_myCell_ribosome' = site1_myCell_ribosome + 1);
	[] site1_myCell_XylS2Production_mrna1_site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_XylS2' = site1_myCell_XylS2 + 1);
	[] site1_myCell_SA_site1_myCell_XylS2 > 0 & site1_myCell_Pm > 0 -> 0.0 : (site1_myCell_Pm' = site1_myCell_Pm - 1) & (site1_myCell_SA_site1_myCell_XylS2' = site1_myCell_SA_site1_myCell_XylS2 - 1) & (site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm' = site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm + 1);
	[] site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm' = site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm - 1) & (site1_myCell_Pm' = site1_myCell_Pm + 1) & (site1_myCell_SA_site1_myCell_XylS2' = site1_myCell_SA_site1_myCell_XylS2 + 1);
	[] site1_myCell_rnaP > 0 & site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm' = site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm - 1) & (site1_myCell_rnaP' = site1_myCell_rnaP - 1) & (site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm_site1_myCell_rnaP' = site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm_site1_myCell_rnaP + 1);
	[] site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm_site1_myCell_rnaP' = site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm_site1_myCell_rnaP - 1) & (site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm' = site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm + 1) & (site1_myCell_rnaP' = site1_myCell_rnaP + 1);
	[] site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_GFPProduction_mrna1' = site1_myCell_GFPProduction_mrna1 + 1);
	[] site1_myCell_PlasR > 0 & site1_myCell_AHL_site1_myCell_LasR > 0 -> 0.0 : (site1_myCell_AHL_site1_myCell_LasR' = site1_myCell_AHL_site1_myCell_LasR - 1) & (site1_myCell_PlasR' = site1_myCell_PlasR - 1) & (site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR' = site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR + 1);
	[] site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR > 0 -> 0.0 : (site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR' = site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR - 1) & (site1_myCell_AHL_site1_myCell_LasR' = site1_myCell_AHL_site1_myCell_LasR + 1) & (site1_myCell_PlasR' = site1_myCell_PlasR + 1);
	[] site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR > 0 & site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR' = site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR - 1) & (site1_myCell_rnaP' = site1_myCell_rnaP - 1) & (site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR_site1_myCell_rnaP' = site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR_site1_myCell_rnaP + 1);
	[] site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR_site1_myCell_rnaP' = site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR_site1_myCell_rnaP - 1) & (site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR' = site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR + 1) & (site1_myCell_rnaP' = site1_myCell_rnaP + 1);
	[] site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_GFPProduction_mrna1' = site1_myCell_GFPProduction_mrna1 + 1);
	[] site1_myCell_GFPProduction_mrna1 > 0 -> 0.0 : (site1_myCell_GFPProduction_mrna1' = site1_myCell_GFPProduction_mrna1 - 1);
	[] site1_myCell_GFPProduction_mrna1 > 0 & site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_GFPProduction_mrna1' = site1_myCell_GFPProduction_mrna1 - 1) & (site1_myCell_ribosome' = site1_myCell_ribosome - 1) & (site1_myCell_GFPProduction_mrna1_site1_myCell_ribosome' = site1_myCell_GFPProduction_mrna1_site1_myCell_ribosome + 1);
	[] site1_myCell_GFPProduction_mrna1_site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_GFPProduction_mrna1_site1_myCell_ribosome' = site1_myCell_GFPProduction_mrna1_site1_myCell_ribosome - 1) & (site1_myCell_GFPProduction_mrna1' = site1_myCell_GFPProduction_mrna1 + 1) & (site1_myCell_ribosome' = site1_myCell_ribosome + 1);
	[] site1_myCell_GFPProduction_mrna1_site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_GFP' = site1_myCell_GFP + 1);
	[] site1_myCell_SA_site1_myCell_XylS2 > 0 & site1_myCell_Pm > 0 -> 0.0 : (site1_myCell_Pm' = site1_myCell_Pm - 1) & (site1_myCell_SA_site1_myCell_XylS2' = site1_myCell_SA_site1_myCell_XylS2 - 1) & (site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm' = site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm + 1);
	[] site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm' = site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm - 1) & (site1_myCell_Pm' = site1_myCell_Pm + 1) & (site1_myCell_SA_site1_myCell_XylS2' = site1_myCell_SA_site1_myCell_XylS2 + 1);
	[] site1_myCell_rnaP > 0 & site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm' = site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm - 1) & (site1_myCell_rnaP' = site1_myCell_rnaP - 1) & (site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm_site1_myCell_rnaP' = site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm_site1_myCell_rnaP + 1);
	[] site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm_site1_myCell_rnaP' = site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm_site1_myCell_rnaP - 1) & (site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm' = site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm + 1) & (site1_myCell_rnaP' = site1_myCell_rnaP + 1);
	[] site1_myCell_SA_site1_myCell_XylS2_site1_myCell_Pm_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_GFPProduction_mrna1' = site1_myCell_GFPProduction_mrna1 + 1);
	[] site1_myCell_PlasR > 0 & site1_myCell_AHL_site1_myCell_LasR > 0 -> 0.0 : (site1_myCell_AHL_site1_myCell_LasR' = site1_myCell_AHL_site1_myCell_LasR - 1) & (site1_myCell_PlasR' = site1_myCell_PlasR - 1) & (site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR' = site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR + 1);
	[] site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR > 0 -> 0.0 : (site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR' = site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR - 1) & (site1_myCell_AHL_site1_myCell_LasR' = site1_myCell_AHL_site1_myCell_LasR + 1) & (site1_myCell_PlasR' = site1_myCell_PlasR + 1);
	[] site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR > 0 & site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR' = site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR - 1) & (site1_myCell_rnaP' = site1_myCell_rnaP - 1) & (site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR_site1_myCell_rnaP' = site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR_site1_myCell_rnaP + 1);
	[] site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR_site1_myCell_rnaP' = site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR_site1_myCell_rnaP - 1) & (site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR' = site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR + 1) & (site1_myCell_rnaP' = site1_myCell_rnaP + 1);
	[] site1_myCell_AHL_site1_myCell_LasR_site1_myCell_PlasR_site1_myCell_rnaP > 0 -> 0.0 : (site1_myCell_GFPProduction_mrna1' = site1_myCell_GFPProduction_mrna1 + 1);
	[] site1_myCell_GFPProduction_mrna1 > 0 -> 0.0 : (site1_myCell_GFPProduction_mrna1' = site1_myCell_GFPProduction_mrna1 - 1);
	[] site1_myCell_GFPProduction_mrna1 > 0 & site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_GFPProduction_mrna1' = site1_myCell_GFPProduction_mrna1 - 1) & (site1_myCell_ribosome' = site1_myCell_ribosome - 1) & (site1_myCell_GFPProduction_mrna1_site1_myCell_ribosome' = site1_myCell_GFPProduction_mrna1_site1_myCell_ribosome + 1);
	[] site1_myCell_GFPProduction_mrna1_site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_GFPProduction_mrna1_site1_myCell_ribosome' = site1_myCell_GFPProduction_mrna1_site1_myCell_ribosome - 1) & (site1_myCell_GFPProduction_mrna1' = site1_myCell_GFPProduction_mrna1 + 1) & (site1_myCell_ribosome' = site1_myCell_ribosome + 1);
	[] site1_myCell_GFPProduction_mrna1_site1_myCell_ribosome > 0 -> 0.0 : (site1_myCell_GFP' = site1_myCell_GFP + 1);

endmodule

//*******************
// reward structures
//*******************
rewards "site1_myCell_GFP_rew"
    true : site1_myCell_GFP;
endrewards
