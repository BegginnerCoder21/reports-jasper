package com.CnpsReport.utils;

import com.CnpsReport.dto.*;
import com.CnpsReport.services.ReportService;
import com.CnpsReport.services.ReportServiceImpl;
import net.sf.jasperreports.engine.JRException;

import java.util.ArrayList;
import java.util.List;

public class DataGenerateReport {

    public static final String BASE_PATH = "/home/teguera-aboubacar/reports/";

    public static void genericReport()
    {
        //Peut être utiliser pour les rapports bilan_P CR_F CR_A CR_V CR_M CR_S CR_I CR_G CR_T CR_E CR_T TF

        ReportService reportService = new ReportServiceImpl();
        String jasperPath = BASE_PATH + "GenericReport.jrxml";
        String outputBasePath = BASE_PATH + "GenericReport";

        List<InfoCnps> infoCnpsList = List.of(
                InfoCnps.builder()
                        .taxIdentification("5000810F-DGE")
                        .companyName("Caisse Nationale de Prévoyance Sociale")
                        .acronym("CNPS")
                        .address("01 BP 317 ABIDJAN Côte d'Ivoire Tel:(225) 27 20 252 100")
                        .closingDate("31/12/2023")
                        .duration("12")
                        .tableHeader("PASSIF")
                        .subTitle("BILAN")
                        .title("BILAN SYSTEME NORMAL")
                        .build()
        );

        List<BilanPDetailsRapport> bilanPDetailsRapportsList = new ArrayList<>();
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P1", "CAPITAUX PROPRES", "", "", 0));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P110", "Capital par dotation", "", "", 1));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P1102", "Dotation-apports", "F/A/V/M/S/I/G/T/E102", "", 0));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P1105", "Ecart de  réévaluation", "S/I/G/T/E105", "", 0));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P111", "Réserves", "", "", 1));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P1F111", "Réserves légales (branche des prestations familiales)", "F111", "",0));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P1A111", "Réserves légales (branche des risques professionnels)", "A111", "", 0));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P1V111", "Réserves légales (branche des pensions)", "V111", "", 0));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P1M111", "Réserves légales (branche de l'assurance maladie)", "M111", "", 0));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P1118", "Autres réserves", "118", "", 0));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P112", "Report à nouveau ", "", "", 1));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P1F121", "Report à nouveau  (branche des prestations familiales)  +ou -", "F121 OU F129", "", 0));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P1A121", "Report à nouveau  (branche des risques professionnels) +ou -", "A121 OU A129", "", 0));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P1V121", "Report à nouveau (branche des pensions) +ou-", "V121 OU V129", "", 0));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P1M121", "Report à nouveau (branche de l'assurance maladie) +ou-", "M121 OU M129", "", 0));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P1121", "Autres reports à nouveau +ou-", "121 OU 129", "", 0));
        bilanPDetailsRapportsList.add(new BilanPDetailsRapport("P113", "Compte de résultat", "", "", 1));

        try {
            reportService.generateRapport(jasperPath, infoCnpsList, bilanPDetailsRapportsList, outputBasePath);
        } catch (JRException e) {
            System.err.println("Erreur lors de la génération du rapport : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void bilanA()
    {

        ReportService reportService = new ReportServiceImpl();
        String jasperPath = BASE_PATH + "Bilan_A.jasper";
        String outputBasePath = BASE_PATH + "Bilan_A";

        List<InfoCnps> infoCnpsList = List.of(
                InfoCnps.builder()
                        .taxIdentification("5000810F-DGE")
                        .companyName("Caisse Nationale de Prévoyance Sociale")
                        .acronym("CNPS")
                        .address("01 BP 317 ABIDJAN Côte d'Ivoire Tel:(225) 27 20 252 100")
                        .closingDate("31/12/2023")
                        .duration("12")
                        .tableHeader("ACTIF")
                        .subTitle("BILAN")
                        .title("BILAN SYSTEME NORMAL")
                        .build()
        );

        List<BilanADetailsRapport> bilanADetailsRapportsList = new ArrayList<>();
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P1", "CAPITAUX PROPRES", "", "", "","", 1));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P110", "Capital par dotation", "", "G/I/S/E2801;", "", "", 0));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P1102", "Dotation-apports", "F/A/V/M/S/I/G/T/E102", "G/I/S/E2801;", "", "", 0));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P1105", "Ecart de  réévaluation", "S/I/G/T/E105", "G/I/S/E2801;", "", "", 0));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P111", "Réserves", "", "", "", "", 1));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P1F111", "Réserves légales (branche des prestations familiales)", "F111", "G/I/S/E2801;","", "", 0));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P1A111", "Réserves légales (branche des risques professionnels)", "A111", "G/I/S/E2801;", "", "", 0));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P1V111", "Réserves légales (branche des pensions)", "V111", "G/I/S/E2801; ", "", "", 0));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P1M111", "Réserves légales (branche de l'assurance maladie)", "M111", "G/I/S/E2801; ", "", "", 0));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P1118", "Autres réserves", "118", "G/I/S/E2801; ", "", "", 0));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P112", "Report à nouveau ", "", "", "", "", 1));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P1F121", "Report à nouveau  (branche des prestations familiales)  +ou -", "F121 OU F129", "G/I/S/E2801; ", "", "", 0));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P1A121", "Report à nouveau  (branche des risques professionnels) +ou -", "A121 OU A129", "G/I/S/E2801; ", "", "", 0));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P1V121", "Report à nouveau (branche des pensions) +ou-", "V121 OU V129", "G/I/S/E2801; ", "", "", 0));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P1M121", "Report à nouveau (branche de l'assurance maladie) +ou-", "M121 OU M129", "G/I/S/E2801;", "", "", 0));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P1121", "Autres reports à nouveau +ou-", "121 OU 129", "G/I/S/E2801; ", "", "", 0));
        bilanADetailsRapportsList.add(new BilanADetailsRapport("P113", "Compte de résultat", "", "", "", "", 1));

        try {
            reportService.generateRapport(jasperPath, infoCnpsList, bilanADetailsRapportsList, outputBasePath);
        } catch (JRException e) {
            System.err.println("Erreur lors de la génération du rapport : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void TAmort()
    {

        ReportService reportService = new ReportServiceImpl();
        String jasperPath = BASE_PATH + "T_AMORT.jasper";
        String outputBasePath = BASE_PATH + "T_AMORT";

        List<InfoCnps> infoCnpsList = List.of(
                InfoCnps.builder()
                        .taxIdentification("5000810F-DGE")
                        .companyName("Caisse Nationale de Prévoyance Sociale")
                        .acronym("CNPS")
                        .address("01 BP 317 ABIDJAN Côte d'Ivoire Tel:(225) 27 20 252 100")
                        .closingDate("31/12/2023")
                        .duration("12")
                        .tableHeader("TABLEAU RECAPITULATIF DES MOUVEMENTS DES AMORTISSEMENTS  TOUTES GESTIONS")
                        .subTitle("BILAN")
                        .title("BILAN SYSTEME NORMAL")
                        .build()
        );

        List<TAmortDetailsRapport> TAmortDetailsRapportsList = new ArrayList<>();
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P1", "AMORTISSEMENTS DES IMMOBILISATIONS INCORPORELLES", "", "", "","",  1));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P110", "Frais d'établissement", "", "", "", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P1102", "Frais d'acquisition des immobilisations", "", "", "", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P1105", "Frais d'études et de plans de constructions", "", "", "", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P111", "Frais de recherche et de dévéloppement", "", "", "", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P1F111", "Concessions et droits similaires, brevets, licences, marques, procédés et valeurs similaires", "", "","", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P1A111", "Droit au bail", "", "", "", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P1V111", "Autres immobilisations incorporelles", "", "", "", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P1M111", "AMORTISSEMENTS DES IMMOBILISATIONS CORPORELLES", "", "", "", "", 1));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P1118", "Constructions", "", "", "", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P112", "Matériel et mobilier de bureau", "", "", "", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P1F121", "Matériel informatique", "", "", "", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P1A121", "Matériel de transport", "", "", "", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P1V121", "Matériel et mobilier techniques des œuvres sanitaires", "", " ", "", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P1M121", "Matériel et mobilier techniques des œuvres sociales", "", "", "", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P1121", "Matériel et mobilier des locaux d'habitations ", "", "", "", "", 0));
        TAmortDetailsRapportsList.add(new TAmortDetailsRapport("P113", "TOTAL GENERAL", "", "", "", "", 1));

        try {
            reportService.generateRapport(jasperPath, infoCnpsList, TAmortDetailsRapportsList, outputBasePath);
        } catch (JRException e) {
            System.err.println("Erreur lors de la génération du rapport : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void TProv()
    {

        ReportService reportService = new ReportServiceImpl();
        String jasperPath = BASE_PATH + "T_PROV.jasper";
        String outputBasePath = BASE_PATH + "T_PROV";

        List<InfoCnps> infoCnpsList = List.of(
                InfoCnps.builder()
                        .taxIdentification("5000810F-DGE")
                        .companyName("Caisse Nationale de Prévoyance Sociale")
                        .acronym("CNPS")
                        .address("01 BP 317 ABIDJAN Côte d'Ivoire Tel:(225) 27 20 252 100")
                        .closingDate("31/12/2023")
                        .duration("12")
                        .tableHeader("TABLEAU RECAPITULATIF DES MOUVEMENTS DES PROVISIONS TOUTES GESTIONS")
                        .subTitle("BILAN")
                        .title("BILAN SYSTEME NORMAL")
                        .build()
        );

        List<TProvDetailsRapport> TProvDetailsRapportsList = new ArrayList<>();
        TProvDetailsRapportsList.add(new TProvDetailsRapport("P1", "PROVISIONS REGLEMENTEES  ", "", "", "","",  0));
        TProvDetailsRapportsList.add(new TProvDetailsRapport("P110", "PROVISIONS POUR RISQUES ET CHARGES ", "", "", "", "", 0));
        TProvDetailsRapportsList.add(new TProvDetailsRapport("P1102", "PROVISIONS POUR DEPRECIATIONS DES IMMOBILISATIONS ", "", "", "", "", 0));
        TProvDetailsRapportsList.add(new TProvDetailsRapport("P1105", "PROVISIONS POUR DEPRECIATIONS DES STOCKS ", "", "", "", "", 0));
        TProvDetailsRapportsList.add(new TProvDetailsRapport("P111", "PROVISIONS POUR DEPRECIATIONS DES TIERS  ", "", "", "", "", 0));
        TProvDetailsRapportsList.add(new TProvDetailsRapport("P1F111", "PROVISIONS POUR DEPRECIATIONS DES COMPTES FINANCIERS  ", "", "","", "", 0));
        TProvDetailsRapportsList.add(new TProvDetailsRapport("P1A111", "TOTAL GENERAL", "", "", "", "", 1));

        try {
            reportService.generateRapport(jasperPath, infoCnpsList, TProvDetailsRapportsList, outputBasePath);
        } catch (JRException e) {
            System.err.println("Erreur lors de la génération du rapport : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void TCreances()
    {

        ReportService reportService = new ReportServiceImpl();
        String jasperPath = BASE_PATH + "T_CREANCES.jasper";
        String outputBasePath = BASE_PATH + "T_CREANCES";

        List<InfoCnps> infoCnpsList = List.of(
                InfoCnps.builder()
                        .taxIdentification("5000810F-DGE")
                        .companyName("Caisse Nationale de Prévoyance Sociale")
                        .acronym("CNPS")
                        .address("01 BP 317 ABIDJAN Côte d'Ivoire Tel:(225) 27 20 252 100")
                        .closingDate("31/12/2023")
                        .duration("12")
                        .tableHeader("TABLEAU DES ECHEANCES DES CREANCES  A LA CLOTURE DE L'EXERCICE")
                        .subTitle("BILAN")
                        .title("BILAN SYSTEME NORMAL")
                        .build()
        );

        List<TCreancesDetailsRapport> TCreancesDetailsRapportsList = new ArrayList<>();
        TCreancesDetailsRapportsList.add(new TCreancesDetailsRapport("P1", " Créances de l'actif immobilisé :", "", "", "","",  1));
        TCreancesDetailsRapportsList.add(new TCreancesDetailsRapport("P110", " - Prêts et autres créances à long et moyen terme : (25)     ", "", "", "", "", 0));
        TCreancesDetailsRapportsList.add(new TCreancesDetailsRapport("P1102", "            - Prêts à l'Etat (250) ", "", "", "", "", 0));
        TCreancesDetailsRapportsList.add(new TCreancesDetailsRapport("P1105", "            - Prêts sociaux (254)", "", "", "", "", 0));
        TCreancesDetailsRapportsList.add(new TCreancesDetailsRapport("P111", "            - Prêts au personnel pour achat de moyens de transport (255) ", "", "", "", "", 0));
        TCreancesDetailsRapportsList.add(new TCreancesDetailsRapport("P1F111", "            - Autres prêts au personnel (256)", "", "","", "", 0));
        TCreancesDetailsRapportsList.add(new TCreancesDetailsRapport("P1A111", "            - Prêts divers (258)", "", "", "", "", 0));
        TCreancesDetailsRapportsList.add(new TCreancesDetailsRapport("P1A111", " Créances de l'actif circulant :", "", "", "", "", 1));
        TCreancesDetailsRapportsList.add(new TCreancesDetailsRapport("P1A111", "            -  - Avances accordées à d’autres organismes de sécurité sociale (267)", "", "", "", "", 0));
        TCreancesDetailsRapportsList.add(new TCreancesDetailsRapport("P1A111", "            -  - Autres immobilisations financières : (27)     ", "", "", "", "", 0));
        TCreancesDetailsRapportsList.add(new TCreancesDetailsRapport("P1A111", "            -             - Prêts immobilisés (272)", "", "", "", "", 0));
        TCreancesDetailsRapportsList.add(new TCreancesDetailsRapport("P1A111", "            - Autres créances immobilisées (278)", "", "", "", "", 0));
        TCreancesDetailsRapportsList.add(new TCreancesDetailsRapport("P1A111", "TOTAL", "", "", "", "", 1));

        try {
            reportService.generateRapport(jasperPath, infoCnpsList, TCreancesDetailsRapportsList, outputBasePath);
        } catch (JRException e) {
            System.err.println("Erreur lors de la génération du rapport : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void TDettes()
    {

        ReportService reportService = new ReportServiceImpl();
        String jasperPath = BASE_PATH + "T_DETTES.jasper";
        String outputBasePath = BASE_PATH + "T_DETTES";

        List<InfoCnps> infoCnpsList = List.of(
                InfoCnps.builder()
                        .taxIdentification("5000810F-DGE")
                        .companyName("Caisse Nationale de Prévoyance Sociale")
                        .acronym("CNPS")
                        .address("01 BP 317 ABIDJAN Côte d'Ivoire Tel:(225) 27 20 252 100")
                        .closingDate("31/12/2023")
                        .duration("12")
                        .tableHeader("TABLEAU DES ECHEANCES DES DETTES A LA CLOTURE DE L'EXERCICE")
                        .subTitle("BILAN")
                        .title("BILAN SYSTEME NORMAL")
                        .build()
        );

        List<TDettesDetailsRapport> TDettesDetailsRapportsList = new ArrayList<>();
        TDettesDetailsRapportsList.add(new TDettesDetailsRapport("P1", " Dettes financières et assimilées", "", "", "","",  1));
        TDettesDetailsRapportsList.add(new TDettesDetailsRapport("P110", " - Avances reçues d'autres organismes de sécurité sociale  (16)", "", "", "", "", 0));
        TDettesDetailsRapportsList.add(new TDettesDetailsRapport("P1102", " - Emprunts et dettes assimilées (17)", "", "", "", "", 0));
        TDettesDetailsRapportsList.add(new TDettesDetailsRapport("P1105", " - Provisions pour risques et charges (19)", "", "", "", "", 0));
        TDettesDetailsRapportsList.add(new TDettesDetailsRapport("P111", "Dettes du passif circulant", "", "", "", "", 1));
        TDettesDetailsRapportsList.add(new TDettesDetailsRapport("P1F111", " - Dettes sur achats et prestations de services et comptes rattachés (40 sauf 405 et 4017)", "", "","", "", 0));
        TDettesDetailsRapportsList.add(new TDettesDetailsRapport("P1A111", " - Prestataires (405 sauf 4057 et 4058)", "", "", "", "", 0));
        TDettesDetailsRapportsList.add(new TDettesDetailsRapport("P1A111", " - Personnel (42)", "", "", "", "", 0));
        TDettesDetailsRapportsList.add(new TDettesDetailsRapport("P1A111", " - Etat, autres collectivités publiques et organismes internationaux (43)", "", "", "", "", 0));
        TDettesDetailsRapportsList.add(new TDettesDetailsRapport("P1A111", " - Etat, autres collectivités publiques et organismes internationaux (43)", "", "", "", "", 0));
        TDettesDetailsRapportsList.add(new TDettesDetailsRapport("P1A111", "  - Clients créditeurs (4117))", "", "", "", "", 0));
        TDettesDetailsRapportsList.add(new TDettesDetailsRapport("P1A111", " - Créditeurs divers (46)", "", "", "", "", 0));
        TDettesDetailsRapportsList.add(new TDettesDetailsRapport("P1A111", "TOTAL", "", "", "", "", 1));

        try {
            reportService.generateRapport(jasperPath, infoCnpsList, TDettesDetailsRapportsList, outputBasePath);
        } catch (JRException e) {
            System.err.println("Erreur lors de la génération du rapport : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void TEngag()
    {

        ReportService reportService = new ReportServiceImpl();
        String jasperPath = BASE_PATH + "T_ENGAG.jasper";
        String outputBasePath = BASE_PATH + "T_ENGAG";

        List<InfoCnps> infoCnpsList = List.of(
                InfoCnps.builder()
                        .taxIdentification("5000810F-DGE")
                        .companyName("Caisse Nationale de Prévoyance Sociale")
                        .acronym("CNPS")
                        .address("01 BP 317 ABIDJAN Côte d'Ivoire Tel:(225) 27 20 252 100")
                        .closingDate("31/12/2023")
                        .duration("12")
                        .tableHeader("TABLEAU DES ENGAGEMENTS EN MATIERE DE BIENS PRIS EN CREDIT-BAIL ET CONTRATS ASSIMILES A LA CLOTURE DE L'EXERCICE")
                        .subTitle("BILAN")
                        .title("BILAN SYSTEME NORMAL")
                        .build()
        );

        List<TEngagDetailsRapport> TEngagDetailsRapportsList = new ArrayList<>();
        TEngagDetailsRapportsList.add(new TEngagDetailsRapport("P1", "", "", "", "", 1));
        TEngagDetailsRapportsList.add(new TEngagDetailsRapport("", "", "", "", "", 0));
        TEngagDetailsRapportsList.add(new TEngagDetailsRapport("IMMOBILIER ", "", "", "", "", 0));
        TEngagDetailsRapportsList.add(new TEngagDetailsRapport("", "", "", "", "", 0));
        TEngagDetailsRapportsList.add(new TEngagDetailsRapport("", "", "", "", "", 0));
        TEngagDetailsRapportsList.add(new TEngagDetailsRapport("CREDIT BAIL MOBILIER  ", "", "", "","", 1));
        TEngagDetailsRapportsList.add(new TEngagDetailsRapport("", "", "", "", "", 0));
        TEngagDetailsRapportsList.add(new TEngagDetailsRapport("INFORMATIQUE", "", "", "", "", 0));
        TEngagDetailsRapportsList.add(new TEngagDetailsRapport("AUTRES ", "", "", "", "", 0));
        TEngagDetailsRapportsList.add(new TEngagDetailsRapport("", "", "", "", "", 0));
        TEngagDetailsRapportsList.add(new TEngagDetailsRapport("TOTAL", "", "", "", "", 1));

        try {
            reportService.generateRapport(jasperPath, infoCnpsList, TEngagDetailsRapportsList, outputBasePath);
        } catch (JRException e) {
            System.err.println("Erreur lors de la génération du rapport : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void TEffectif()
    {

        ReportService reportService = new ReportServiceImpl();
        String jasperPath = BASE_PATH + "T_EFFECTIF.jasper";
        String outputBasePath = BASE_PATH + "T_EFFECTIF";

        List<InfoCnps> infoCnpsList = List.of(
                InfoCnps.builder()
                        .taxIdentification("5000810F-DGE")
                        .companyName("Caisse Nationale de Prévoyance Sociale")
                        .acronym("CNPS")
                        .address("01 BP 317 ABIDJAN Côte d'Ivoire Tel:(225) 27 20 252 100")
                        .closingDate("31/12/2023")
                        .duration("12")
                        .tableHeader("TABLEAU DES EFFECTIFS ET MASSES SALARIALES  A LA CLOTURE DE L'EXERCICE TOUTES GESTIONS ")
                        .subTitle("BILAN")
                        .title("BILAN SYSTEME NORMAL")
                        .build()
        );

        List<TEffectifDetailsRapport> TEffecfifDetailsRapportsList = new ArrayList<>();
        TEffecfifDetailsRapportsList.add(new TEffectifDetailsRapport("", "", "", 0));
        TEffecfifDetailsRapportsList.add(new TEffectifDetailsRapport("CADRES", "", "", 0));
        TEffecfifDetailsRapportsList.add(new TEffectifDetailsRapport("CATEGORIE INTERMEDIAIRE ", "", "", 0));
        TEffecfifDetailsRapportsList.add(new TEffectifDetailsRapport("EMPLOYERS ET OUVRIERS", "", "", 0));
        TEffecfifDetailsRapportsList.add(new TEffectifDetailsRapport("PERSONNEL DIVERS", "", "", 0));
        TEffecfifDetailsRapportsList.add(new TEffectifDetailsRapport("", "", "", 0));
        TEffecfifDetailsRapportsList.add(new TEffectifDetailsRapport("TOTAL", "", "", 1));

        try {
            reportService.generateRapport(jasperPath, infoCnpsList, TEffecfifDetailsRapportsList, outputBasePath);
        } catch (JRException e) {
            System.err.println("Erreur lors de la génération du rapport : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void TResult()
    {

        ReportService reportService = new ReportServiceImpl();
        String jasperPath = BASE_PATH + "T_RESULT5ANS.jasper";
        String outputBasePath = BASE_PATH + "T_RESULT5ANS";

        List<InfoCnps> infoCnpsList = List.of(
                InfoCnps.builder()
                        .taxIdentification("5000810F-DGE")
                        .companyName("Caisse Nationale de Prévoyance Sociale")
                        .acronym("CNPS")
                        .address("01 BP 317 ABIDJAN Côte d'Ivoire Tel:(225) 27 20 252 100")
                        .closingDate("31/12/2023")
                        .duration("12")
                        .tableHeader("TABLEAU DES RESULTATS ET AUTRES ELEMENTS CARACTERISTIQUES DE L'ORGANISME AU COURS DES CINQ DERNIERS EXERCICES TOUTES GESTIONS")
                        .subTitle("BILAN")
                        .title("BILAN SYSTEME NORMAL")
                        .build()
        );

        List<TResultDetailsRapport> TResultDetailsRapportsList = new ArrayList<>();
        TResultDetailsRapportsList.add(new TResultDetailsRapport("OPERATIONS CARACTERISTIQUES ET RESULTATS DE L'EXERCICE DES BRANCHES ", "", "", "", "", "", 1));
        TResultDetailsRapportsList.add(new TResultDetailsRapport("PRODUITS TECHNIQUES ( 701, 702, 703, 708 )", "", "", "", "", "", 0));
        TResultDetailsRapportsList.add(new TResultDetailsRapport("CHARGES TECHNIQUES (601,602,603, 604) ", "", "","", "", "", 0));
        TResultDetailsRapportsList.add(new TResultDetailsRapport("RESULTAT TECHNIQUE (R1)", "", "","", "", "", 0));
        TResultDetailsRapportsList.add(new TResultDetailsRapport("PRELEVEMENTS AU PROFIT DE LA GESTION ADMINISTRATIVE ", "", "","", "", "", 0));
        TResultDetailsRapportsList.add(new TResultDetailsRapport("PERSONNEL", "", "","", "", "", 0));
        TResultDetailsRapportsList.add(new TResultDetailsRapport("EFFECTIF DES SALARIES EMPLOYES PRESENTS AU 31DECEMBRE", "", "","", "", "", 0));
        TResultDetailsRapportsList.add(new TResultDetailsRapport("MONTANT DE LA MASSE SALARIALE DE L'EXERCICE ( 651 + 652 )", "", "","", "", "", 0));
        TResultDetailsRapportsList.add(new TResultDetailsRapport("TOTAL", "", "","", "", "", 1));

        try {
            reportService.generateRapport(jasperPath, infoCnpsList, TResultDetailsRapportsList, outputBasePath);
        } catch (JRException e) {
            System.err.println("Erreur lors de la génération du rapport : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void CR()
    {

        ReportService reportService = new ReportServiceImpl();
        String jasperPath = BASE_PATH + "CR.jasper";
        String outputBasePath = BASE_PATH + "CR";

        List<InfoCnps> infoCnpsList = List.of(
                InfoCnps.builder()
                        .taxIdentification("5000810F-DGE")
                        .companyName("Caisse Nationale de Prévoyance Sociale")
                        .acronym("CNPS")
                        .address("01 BP 317 ABIDJAN Côte d'Ivoire Tel:(225) 27 20 252 100")
                        .closingDate("31/12/2023")
                        .duration("12")
                        .tableHeader("COMPTE DE RESULTAT TOUTES GESTIONS EXERCICE N")
                        .subTitle("BILAN")
                        .title("BILAN SYSTEME NORMAL")
                        .build()
        );

        List<CRDetailsRapport> CRDetailsRapportsList = new ArrayList<>();
        CRDetailsRapportsList.add(new CRDetailsRapport("CR7701", "COTISATIONS", "", "", "", "", "", "", "", "", "", "", "", 0));
        CRDetailsRapportsList.add(new CRDetailsRapport("CR7702", "MAJORATIONS ET PENALITES DE RETARD", "", "", "", "","", "", "", "", "", "", "", 0));
        CRDetailsRapportsList.add(new CRDetailsRapport("CR7703", "RACHATS DE COTISATIONS", "","", "", "","", "", "", "", "", "", "", 0));
        CRDetailsRapportsList.add(new CRDetailsRapport("CR7708", "AUTRES PRODUITS TECHNIQUES", "","", "", "","", "", "", "", "", "", "", 0));
        CRDetailsRapportsList.add(new CRDetailsRapport("CR7708", "RECETTES DE PRODUCTION", "","", "", "","", "", "", "", "", "", "", 0));
        CRDetailsRapportsList.add(new CRDetailsRapport("CR7708", "PRODUCTION STOCKEE", "","", "", "","", "", "", "", "", "", "", 0));
        CRDetailsRapportsList.add(new CRDetailsRapport("CR7708", "PRODUCTION IMMOBILISEE", "","", "", "","", "", "", "", "", "", "", 0));
        CRDetailsRapportsList.add(new CRDetailsRapport("CR7708", "TRANSFERT DE CHARGES ", "","", "", "","", "", "", "", "", "", "", 0));
        CRDetailsRapportsList.add(new CRDetailsRapport("CR7708", "TOTAL DES PRODUITS DE L'EXERCICE", "","", "", "","", "", "", "", "", "", "", 1));

        try {
            reportService.generateRapport(jasperPath, infoCnpsList, CRDetailsRapportsList, outputBasePath);
        } catch (JRException e) {
            System.err.println("Erreur lors de la génération du rapport : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void TImmo()
    {

        ReportService reportService = new ReportServiceImpl();
        String jasperPath = BASE_PATH + "T_IMMO.jasper";
        String outputBasePath = BASE_PATH + "T_IMMO";

        List<InfoCnps> infoCnpsList = List.of(
                InfoCnps.builder()
                        .taxIdentification("5000810F-DGE")
                        .companyName("Caisse Nationale de Prévoyance Sociale")
                        .acronym("CNPS")
                        .address("01 BP 317 ABIDJAN Côte d'Ivoire Tel:(225) 27 20 252 100")
                        .closingDate("31/12/2023")
                        .duration("12")
                        .tableHeader("TABLEAU RECAPITULATIF DES MOUVEMENTS DES IMMOBILISATIONS TOUTES GESTIONS")
                        .subTitle("BILAN")
                        .title("BILAN SYSTEME NORMAL")
                        .build()
        );

        List<TImmoDetailsRapport> TimmoDetailsRapportsList = new ArrayList<>();
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7701", "IMMOBILISATIONS INCORPORELLES", "", "", "", "", "", "", "", 1));
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7702", "Frais d'établissement", "", "", "", "","", "", "", 0));
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7703", "Frais d'acquisition des immobilisations", "","", "", "","", "", "", 0));
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7708", "Frais d'études et de plans de constructions", "","", "", "","", "", "", 0));
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7708", "Frais de recherche et de dévéloppement", "","", "", "","", "", "", 0));
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7708", "Concessions et droits similaires, brevets, licences, marques, procédés et valeurs similaires.", "","", "", "","", "", "", 0));
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7708", "Droit au bail", "","", "", "","", "", "", 0));
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7708", "Autres immobilisations incorporelles", "","", "", "","", "", "", 0));
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7708", "IMMOBILISATIONS EN COURS ", "","", "", "","", "", "", 1));
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7708", "Immobilisations incorporelles en cours", "","", "", "","", "", "", 0));
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7708", "Constructions en cours", "","", "", "","", "", "", 0));
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7708", "Autres Immobilisations corporelles en cours", "","", "", "","", "", "", 0));
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7708", "AVANCES ET ACOMPTES SUR COMMANDES D'IMMOBILISATIONS ", "","", "", "","", "", "", 0));
        TimmoDetailsRapportsList.add(new TImmoDetailsRapport("CR7708", "TOTAL GENERAL", "","", "", "","", "", "", 1));

        try {
            reportService.generateRapport(jasperPath, infoCnpsList, TimmoDetailsRapportsList, outputBasePath);
        } catch (JRException e) {
            System.err.println("Erreur lors de la génération du rapport : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void TCotis()
    {

        ReportService reportService = new ReportServiceImpl();
        String jasperPath = BASE_PATH + "T_COTIS.jasper";
        String outputBasePath = BASE_PATH + "T_COTIS";

        List<InfoCnps> infoCnpsList = List.of(
                InfoCnps.builder()
                        .taxIdentification("5000810F-DGE")
                        .companyName("Caisse Nationale de Prévoyance Sociale")
                        .acronym("CNPS")
                        .address("01 BP 317 ABIDJAN Côte d'Ivoire Tel:(225) 27 20 252 100")
                        .closingDate("31/12/2023")
                        .duration("12")
                        .tableHeader("TABLEAU DE VENTILATION DES COTISATIONS ET MAJORATIONS RECOUVREES PENDANT L'EXERCICE")
                        .subTitle("BILAN")
                        .title("BILAN SYSTEME NORMAL")
                        .build()
        );

        List<TCotisDetailsRapport> TCotisDetailsRapportsList = new ArrayList<>();
        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("VENTILATION PAR EXERCICE DES COTISATIONS", "N", "", "", "", "", "", "", "", "", "", 0));
        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("COTISATIONS", "N", "", "", "", "","", "", "", "", "", 0));
        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("MAJORATIONS DE RETARD", "N", "","", "", "","", "", "","", "", 0));
        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("PENALITES", "N", "","", "", "","", "", "","", "", 0));
        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("TOTAUX", "Autres exercices", "","", "", "","", "", "","", "", 1));
//        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("CR7708", "Concessions et droits similaires, brevets, licences, marques, procédés et valeurs similaires.", "","", "", "","", "", "","", "", 0));
//        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("CR7708", "Droit au bail", "","", "", "","", "", "","", "", 0));
//        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("CR7708", "Autres immobilisations incorporelles", "","", "", "","", "", "","", "", 0));
//        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("CR7708", "IMMOBILISATIONS EN COURS ", "","", "", "","", "", "","", "", 1));
//        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("CR7708", "Immobilisations incorporelles en cours", "","", "", "","", "", "","", "", 0));
//        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("CR7708", "Constructions en cours", "","", "", "","", "", "","", "", 0));
//        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("CR7708", "Autres Immobilisations corporelles en cours", "","", "", "","", "", "","", "", 0));
//        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("CR7708", "AVANCES ET ACOMPTES SUR COMMANDES D'IMMOBILISATIONS ", "","", "", "","", "", "","", "", 0));
//        TCotisDetailsRapportsList.add(new TCotisDetailsRapport("CR7708", "TOTAL GENERAL", "","", "", "","", "", "","", "", 1));

        try {
            reportService.generateRapport(jasperPath, infoCnpsList, TCotisDetailsRapportsList, outputBasePath);
        } catch (JRException e) {
            System.err.println("Erreur lors de la génération du rapport : " + e.getMessage());
            e.printStackTrace();
        }
    }

}
