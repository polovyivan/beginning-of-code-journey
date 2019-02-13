package ivan.polovyi.AuxiliarySystem.model.utilities.output;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import ivan.polovyi.AuxiliarySystem.model.utilities.beans.BillBean;
import ivan.polovyi.AuxiliarySystem.model.utilities.beans.ProductBeanXML;
import ivan.polovyi.AuxiliarySystem.view.ViewFactory;
import javafx.collections.ObservableList;

public class CreateWriteXMLFile {

	private static ObservableList<ProductBeanXML> products;
	private static BillBean bill;
	final String PIS_PER = "1.65";
	final String COFINS_PER = "7.60";

	public CreateWriteXMLFile(ObservableList<ProductBeanXML> listOfProducts, BillBean bill) {
		this.setProducts(listOfProducts);
		this.setBill(bill);

	}

	public Document xml() {
		double pisD = 0;
		double cofinsD = 0;
		double pisTotal = 0;
		double cofinsTotal = 0;

		// UF //random //#NF random
		// 35 980923343832000106550010 000033391 003117900

		Document doc = null;

		try {

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// root elements
			doc = docBuilder.newDocument();

			Element rootElement = doc.createElement("nfeProc");
			doc.appendChild(rootElement);
			// Add atributs
			rootElement.setAttribute("versao", "4.00");
			rootElement.setAttribute("xmlns", "http://www.portalfiscal.inf.br/nfe");

			// NFEe element
			Element elementNFe = doc.createElement("NFe");

			rootElement.appendChild(elementNFe);
			elementNFe.setAttribute("xmlns", "http://www.portalfiscal.inf.br/");

			// protNFe element
			Element elementprotNFe = doc.createElement("protNFe");
			rootElement.appendChild(elementprotNFe);
			elementprotNFe.setAttribute("versao", "4.00");

			// infProt
			Element elementinfProt = doc.createElement("infProt");
			elementprotNFe.appendChild(elementinfProt);

			// tpAmb
			Element elementtpAmb = doc.createElement("tpAmb");
			elementinfProt.appendChild(elementtpAmb);

			// verAplic
			Element elementverAplic = doc.createElement("verAplic");
			elementinfProt.appendChild(elementverAplic);
			// chNFe
			Element elementchNFe = doc.createElement("chNFe");
			elementinfProt.appendChild(elementchNFe);
			// elementchNFe.setTextContent(billKey);
			// dhRecbto
			Element elementdhRecbto = doc.createElement("dhRecbto");
			elementinfProt.appendChild(elementdhRecbto);

			// nProt

			Element elementnProt = doc.createElement("nProt");
			elementinfProt.appendChild(elementnProt);

			// digVal
			Element elementdigVal = doc.createElement("digVal");
			elementinfProt.appendChild(elementdigVal);
			// cStat
			Element elementcStat = doc.createElement("cStat");
			elementinfProt.appendChild(elementcStat);
			// xMotivo
			Element elementcxMotivo = doc.createElement("xMotivo");
			elementinfProt.appendChild(elementcxMotivo);

			// infNFe element
			Element elementinfNFe = doc.createElement("infNFe");
			elementNFe.appendChild(elementinfNFe);
			elementinfNFe.setAttribute("versao", "4.00");
			elementinfNFe.setAttribute("Id", bill.getBillBarcodeKey());// has to be set
//Signature
			Element elementinfSignature = doc.createElement("Signature");
			elementNFe.appendChild(elementinfSignature);
			elementinfSignature.setAttribute("xmlns", "http://www.w3.org/2000/09/xmldsig#");
//SignedInfo
			Element elementSignedInfo = doc.createElement("SignedInfo");
			elementinfSignature.appendChild(elementSignedInfo);
			// CanonicalizationMethod
			Element elementCanonicalizationMethod = doc.createElement("CanonicalizationMethod");
			elementSignedInfo.appendChild(elementCanonicalizationMethod);
			elementCanonicalizationMethod.setAttribute("Algorithm", "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");

			// SignatureMethod

			Element elementSignatureMethod = doc.createElement("SignatureMethod");
			elementSignedInfo.appendChild(elementSignatureMethod);
			elementSignatureMethod.setAttribute("Algorithm", "http://www.w3.org/2000/09/xmldsig#rsa-sha1");

			// Reference
			Element elementReference = doc.createElement("Reference");
			elementSignedInfo.appendChild(elementReference);
			elementReference.setAttribute("URI", bill.getBillBarcodeKey());

			// Transforms
			Element elementTransforms = doc.createElement("Transforms");
			elementReference.appendChild(elementTransforms);
			// Transform
			Element elementTransform = doc.createElement("Transform");
			elementTransforms.appendChild(elementTransform);
			elementTransform.setAttribute("Algorithm", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
			elementTransforms.appendChild(elementTransform);
			elementTransform.setAttribute("Algorithm", "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");

			// DigestMethod
			Element elementDigestMethod = doc.createElement("DigestMethod");
			elementReference.appendChild(elementDigestMethod);
			elementDigestMethod.setAttribute("Algorithm", "http://www.w3.org/2000/09/xmldsig#sha1");

			// DigestMethod
			Element elementDigestValue = doc.createElement("DigestValue");
			elementReference.appendChild(elementDigestValue);

			// SignatureValue
			Element elementSignatureValue = doc.createElement("SignatureValue");
			elementinfSignature.appendChild(elementSignatureValue);
			// KeyInfo
			Element elementKeyInfo = doc.createElement("KeyInfo");
			elementinfSignature.appendChild(elementKeyInfo);

			// X509Data
			Element elementX509Data = doc.createElement("X509Data");
			elementKeyInfo.appendChild(elementX509Data);

			// X509Certificate
			Element elementX509Certificate = doc.createElement("X509Certificate");
			elementX509Data.appendChild(elementX509Certificate);

			// ide
			Element elementinIde = doc.createElement("ide");
			elementinfNFe.appendChild(elementinIde);
			// cUF
			Element elementcUF = doc.createElement("cUF");
			elementinIde.appendChild(elementcUF);

			// cNF
			Element elementcNF = doc.createElement("cNF");
			elementinIde.appendChild(elementcNF);

			// natOp
			Element elementnatOp = doc.createElement("natOp");
			elementinIde.appendChild(elementnatOp);

			// mod
			Element elementmod = doc.createElement("mod");
			elementinIde.appendChild(elementmod);

			// serie
			Element elementserie = doc.createElement("serie");
			elementinIde.appendChild(elementserie);

			// nNF
			Element elementnNF = doc.createElement("nNF");
			elementinIde.appendChild(elementnNF);
			elementnNF.setTextContent(bill.getBillNumber());

			// dhEmi
			Element elementdhEmi = doc.createElement("dhEmi");
			elementinIde.appendChild(elementdhEmi);
			elementdhEmi.setTextContent(bill.getBillDate());
			// dhSaiEnt
			Element elementdhSaiEnt = doc.createElement("dhSaiEnt");
			elementinIde.appendChild(elementdhSaiEnt);

			// tpNF
			Element elementtpNF = doc.createElement("tpNF");
			elementinIde.appendChild(elementtpNF);

			// idDest
			Element elementidDest = doc.createElement("idDest");
			elementinIde.appendChild(elementidDest);

			// cMunFG
			Element elementcMunFG = doc.createElement("cMunFG");
			elementinIde.appendChild(elementcMunFG);

			// tpImp
			Element elementtpImp = doc.createElement("tpImp");
			elementinIde.appendChild(elementtpImp);

			// tpEmis
			Element elementtpEmis = doc.createElement("tpEmis");
			elementinIde.appendChild(elementtpEmis);

			// tpEmis
			Element elementcDV = doc.createElement("cDV");
			elementinIde.appendChild(elementcDV);

			// tpAmb
			Element elementtpAmbIde = doc.createElement("tpAmb");
			elementinIde.appendChild(elementtpAmbIde);

			// finNFe
			Element elementfinNFe = doc.createElement("finNFe");
			elementinIde.appendChild(elementfinNFe);

			// indFinal
			Element elementindFinal = doc.createElement("indFinal");
			elementinIde.appendChild(elementindFinal);

			// indPres
			Element elementindPres = doc.createElement("indPres");
			elementinIde.appendChild(elementindPres);

			// procEmi
			Element elementprocEmi = doc.createElement("procEmi");
			elementinIde.appendChild(elementprocEmi);

			// verProc
			Element elementverProc = doc.createElement("verProc");
			elementinIde.appendChild(elementverProc);

			// emit
			Element elementinEmit = doc.createElement("emit");
			elementinfNFe.appendChild(elementinEmit);

			// CNPJ
			Element elementCNPJ = doc.createElement("CNPJ");
			elementCNPJ.setTextContent(bill.getSupplierCNPJ());
			elementinEmit.appendChild(elementCNPJ);

			// xNome nome do fornecedor
			Element elementxNome = doc.createElement("xNome");
			elementinEmit.appendChild(elementxNome);
			elementxNome.setTextContent(bill.getSupplierName());

			// xFant
			Element elementxFant = doc.createElement("xFant");
			elementinEmit.appendChild(elementxFant);
			elementxFant.setTextContent(bill.getSupplierName());
			// enderEmit
			Element elementenderEmit = doc.createElement("enderEmit");
			elementinEmit.appendChild(elementenderEmit);

			// enderEmit
			Element elementxLgr = doc.createElement("xLgr");
			elementenderEmit.appendChild(elementxLgr);

			// nro
			Element elementnro = doc.createElement("nro");
			elementenderEmit.appendChild(elementnro);

			// xBairro
			Element elementxBairro = doc.createElement("xBairro");
			elementenderEmit.appendChild(elementxBairro);

			// cMun
			Element elementcMun = doc.createElement("cMun");
			elementenderEmit.appendChild(elementcMun);

			// xMun
			Element elementxMun = doc.createElement("xMun");
			elementenderEmit.appendChild(elementxMun);

			// UF
			Element elementUF = doc.createElement("UF");
			elementenderEmit.appendChild(elementUF);

			// CEP
			Element elementCEP = doc.createElement("CEP");
			elementenderEmit.appendChild(elementCEP);

			// cPais
			Element elementcPais = doc.createElement("cPais");
			elementenderEmit.appendChild(elementcPais);

			// xPais
			Element elementxPais = doc.createElement("xPais");
			elementenderEmit.appendChild(elementxPais);
			// fone
			Element elementfone = doc.createElement("fone");
			elementenderEmit.appendChild(elementfone);

			// IE
			Element elementIE = doc.createElement("IE");
			elementinEmit.appendChild(elementIE);
			// CRT
			Element elemenCRT = doc.createElement("CRT");
			elementinEmit.appendChild(elemenCRT);

			// dest
			Element elementinDest = doc.createElement("dest");
			elementinfNFe.appendChild(elementinDest);

			// CNPJDest
			Element elementinCNPJDest = doc.createElement("CNPJ");
			elementinDest.appendChild(elementinCNPJDest);
			elementinCNPJDest.setTextContent(bill.getSubsidiaryCNPJ());

			// xNomeDest
			Element elementinxNomeDest = doc.createElement("xNome");
			elementinDest.appendChild(elementinxNomeDest);
			// enderDest
			Element elementenderDest = doc.createElement("enderDest");
			elementinDest.appendChild(elementenderDest);

			// xLgrDesdt
			Element elementxLgrDesdt = doc.createElement("xLgr");
			elementenderDest.appendChild(elementxLgrDesdt);
			// nroDesdt
			Element elementnroDesdt = doc.createElement("nro");
			elementenderDest.appendChild(elementnroDesdt);

			// xBairroDesdt
			Element elementxBairroDesdt = doc.createElement("xBairro");
			elementenderDest.appendChild(elementxBairroDesdt);

			// cMunDesdt
			Element elementcMunDesdt = doc.createElement("cMun");
			elementenderDest.appendChild(elementcMunDesdt);
			// xMunDesdt
			Element elementxMunDesdt = doc.createElement("xMun");
			elementenderDest.appendChild(elementxMunDesdt);

			// UFDesdt
			Element elementUFDesdt = doc.createElement("UF");
			elementenderDest.appendChild(elementUFDesdt);

			// CEPDesdt
			Element elementCEPDesdt = doc.createElement("CEP");
			elementenderDest.appendChild(elementCEPDesdt);
			// cPaisDesdt
			Element elementcPaisDesdt = doc.createElement("cPais");
			elementenderDest.appendChild(elementcPaisDesdt);
			// xPaisDesdt
			Element elementxPaisDesdt = doc.createElement("xPais");
			elementenderDest.appendChild(elementxPaisDesdt);

			// foneDesdt
			Element elementfoneDesdt = doc.createElement("fone");
			elementenderDest.appendChild(elementfoneDesdt);

			// indIEDest
			Element elementindIEDest = doc.createElement("indIEDest");
			elementinDest.appendChild(elementindIEDest);

			// IEDest
			Element elementIEDest = doc.createElement("IE");
			elementinDest.appendChild(elementIEDest);

			// loop of items

			int i = 0;
			for (ProductBeanXML productBean : products) {
				i++;
				String itemsCounterString = Integer.toString(i);

				// det item
				Element det = doc.createElement("det");
				elementinfNFe.appendChild(det);
				det.setAttribute("nItem", itemsCounterString);
				// prod
				Element detProd = doc.createElement("prod");
				det.appendChild(detProd);
//111111111111111111111111111111111111111111111111111111111111111111111111
				// detProdcProd product code
				Element detProdcProd = doc.createElement("cProd");
				detProd.appendChild(detProdcProd);
				detProdcProd.setTextContent(productBean.getProductHBLOCode());

				// detProdcEAN
				Element detProdcEAN = doc.createElement("cEAN");
				detProd.appendChild(detProdcEAN);
				detProdcEAN.setTextContent("SEM GTIN");
//22222222222222222222222222222222222222222222222222222222222222222222222222
				// detProdxProd product name
				Element detProdxProd = doc.createElement("xProd");
				detProd.appendChild(detProdxProd);
				detProdxProd.setTextContent(productBean.getProductName());

				// detProdxNCM
				Element detProdxNCM = doc.createElement("NCM");
				detProd.appendChild(detProdxNCM);
				detProdxNCM.setTextContent("06029029");
				// detProdCFOP
				Element detProdCFOP = doc.createElement("CFOP");
				detProd.appendChild(detProdCFOP);
				detProdCFOP.setTextContent("5102");
				// detProduCom
				Element detProduCom = doc.createElement("uCom");
				detProd.appendChild(detProduCom);
				detProduCom.setTextContent("UN");

				// 33333333333333333333333333333333333333333
				// detProdqCom quantity

				int boxQty = Integer.parseInt(productBean.getBoxQuantity().replaceAll(" ", ""));
				int perBoxQty = Integer.parseInt(productBean.getQuantityPerBox().replaceAll(" ", ""));

				Element detProdqCom = doc.createElement("qCom");
				detProd.appendChild(detProdqCom);
				detProdqCom.setTextContent(Integer.toString(boxQty * perBoxQty));
//44444444444444444444444444444444444444444444
				// detProdvUnCom price
				Element detProdvUnCom = doc.createElement("vUnCom");
				detProd.appendChild(detProdvUnCom);
				detProdvUnCom.setTextContent(productBean.getProductPrice());

				// detProdvProd
				Element detProdvProd = doc.createElement("vProd");
				detProd.appendChild(detProdvProd);
				detProdvProd.setTextContent(productBean.getProductTotal());
				// detProdvProd
				Element detProdcEANTrib = doc.createElement("cEANTrib");
				detProd.appendChild(detProdcEANTrib);
				detProdcEANTrib.setTextContent("SEM GTIN");
				// detProduTrib
				Element detProduTrib = doc.createElement("uTrib");
				detProd.appendChild(detProduTrib);
				detProduTrib.setTextContent("UN");
				// detProdqTrib
				Element detProdqTrib = doc.createElement("qTrib");
				detProd.appendChild(detProdqTrib);
				detProdqTrib.setTextContent(Integer.toString(boxQty * perBoxQty));
				// detProdqTrib
				Element detProdvUnTrib = doc.createElement("vUnTrib");
				detProd.appendChild(detProdvUnTrib);

				detProdvUnTrib.setTextContent(productBean.getProductPrice());
				// detProdindTot
				Element detProdindTot = doc.createElement("indTot");
				detProd.appendChild(detProdindTot);

				// imposto
				Element detImposto = doc.createElement("imposto");
				det.appendChild(detImposto);

				// ICMS
				Element ICMS = doc.createElement("ICMS");
				detImposto.appendChild(ICMS);
				// ICMSSN101
				Element ICMSSN101 = doc.createElement("ICMSSN101");
				ICMS.appendChild(ICMSSN101);

				// orig
				Element orig = doc.createElement("orig");
				ICMSSN101.appendChild(orig);

				// CSOSN
				Element CSOSN = doc.createElement("CSOSN");
				ICMSSN101.appendChild(CSOSN);
				// pCredSN
				Element pCredSN = doc.createElement("pCredSN");
				ICMSSN101.appendChild(pCredSN);
				// pCredSN
				Element vCredICMSSN = doc.createElement("vCredICMSSN");
				ICMSSN101.appendChild(vCredICMSSN);

				// IPI
				Element IPI = doc.createElement("IPI");
				detImposto.appendChild(IPI);

				// cEnq
				Element cEnq = doc.createElement("cEnq");
				IPI.appendChild(cEnq);

				// IPITrib
				Element IPITrib = doc.createElement("IPITrib");
				IPI.appendChild(IPITrib);

				// CST
				Element CST = doc.createElement("CST");
				IPITrib.appendChild(CST);

				// vBC
				Element vBC = doc.createElement("vBC");
				IPITrib.appendChild(vBC);

				// pIPI
				Element pIPI = doc.createElement("pIPI");
				IPITrib.appendChild(pIPI);
				// vIPI
				Element vIPI = doc.createElement("vIPI");
				IPITrib.appendChild(vIPI);

				// PIS
				Element PIS = doc.createElement("PIS");
				detImposto.appendChild(PIS);

				// PISOutr
				Element PISOutr = doc.createElement("PISAliq");
				PIS.appendChild(PISOutr);

				// PISOutr
				Element CSTPISOutr = doc.createElement("CST");
				PISOutr.appendChild(CSTPISOutr);

				// vBC
				Element vBCPISOutr = doc.createElement("vBC");
				PISOutr.appendChild(vBCPISOutr);
				vBCPISOutr.setTextContent(productBean.getProductTotal());
				// pPIS
				Element pPISPISOutr = doc.createElement("pPIS");
				PISOutr.appendChild(pPISPISOutr);
				pPISPISOutr.setTextContent(PIS_PER);
				// vPIS
				Element vPISPISOutr = doc.createElement("vPIS");
				PISOutr.appendChild(vPISPISOutr);
				vPISPISOutr.setTextContent(productBean.getPis());

				// COFINS
				Element COFINS = doc.createElement("COFINS");
				detImposto.appendChild(COFINS);

				// COFINSOutr
				Element COFINSOutr = doc.createElement("COFINSAliq");
				COFINS.appendChild(COFINSOutr);

				// CSTCOFINSOutr
				Element CSTCOFINSOutr = doc.createElement("CST");
				COFINSOutr.appendChild(CSTCOFINSOutr);

				// vBCCOFINSOutr
				Element vBCCOFINSOutr = doc.createElement("vBC");
				COFINSOutr.appendChild(vBCCOFINSOutr);
				vBCCOFINSOutr.setTextContent(productBean.getProductTotal());
				// pCOFINSCOFINSOutr
				Element pCOFINSCOFINSOutr = doc.createElement("pCOFINS");
				COFINSOutr.appendChild(pCOFINSCOFINSOutr);
				pCOFINSCOFINSOutr.setTextContent(COFINS_PER);
				// vCOFINSCOFINSOutr
				Element vCOFINSCOFINSOutr = doc.createElement("vCOFINS");
				COFINSOutr.appendChild(vCOFINSCOFINSOutr);
				vCOFINSCOFINSOutr.setTextContent(productBean.getCofins());

				// total PIS CoFINS Calculation

				pisD = Float.valueOf(productBean.getPis());
				cofinsD = Float.valueOf(productBean.getCofins());

				pisTotal = pisTotal + pisD;
				cofinsTotal = cofinsTotal + cofinsD;

			}
			// total
			Element elementinTotal = doc.createElement("total");
			elementinfNFe.appendChild(elementinTotal);

			// ICMSTot
			Element elementICMSTot = doc.createElement("ICMSTot");
			elementinTotal.appendChild(elementICMSTot);

			// vBC
			Element elementvBC = doc.createElement("vBC");
			elementICMSTot.appendChild(elementvBC);

			// vICMS
			Element vICMS = doc.createElement("vICMS");
			elementICMSTot.appendChild(vICMS);

			// vICMSDeson
			Element vICMSDeson = doc.createElement("vICMSDeson");
			elementICMSTot.appendChild(vICMSDeson);

			// vFCP
			Element vFCP = doc.createElement("vFCP");
			elementICMSTot.appendChild(vFCP);

			// vBCST
			Element vBCST = doc.createElement("vBCST");
			elementICMSTot.appendChild(vBCST);

			// vST
			Element vST = doc.createElement("vST");
			elementICMSTot.appendChild(vST);

			// vFCPST
			Element vFCPST = doc.createElement("vFCPST");
			elementICMSTot.appendChild(vFCPST);

			// vFCPSTRet
			Element vFCPSTRet = doc.createElement("vFCPSTRet");
			elementICMSTot.appendChild(vFCPSTRet);

			// vProd
			Element vProd = doc.createElement("vProd");
			elementICMSTot.appendChild(vProd);
			vProd.setTextContent(bill.getBillTotal());
			// vFrete
			Element vFrete = doc.createElement("vFrete");
			elementICMSTot.appendChild(vFrete);

			// vSeg
			Element vSeg = doc.createElement("vSeg");
			elementICMSTot.appendChild(vSeg);

			// vDesc
			Element vDesc = doc.createElement("vDesc");
			elementICMSTot.appendChild(vDesc);

			// vDesc
			Element vII = doc.createElement("vII");
			elementICMSTot.appendChild(vII);

			// vIPI
			Element vIPI = doc.createElement("vIPI");
			elementICMSTot.appendChild(vIPI);

			// vIPIDevol
			Element vIPIDevol = doc.createElement("vIPIDevol");
			elementICMSTot.appendChild(vIPIDevol);

			// vPIS
			Element vPIS = doc.createElement("vPIS");
			elementICMSTot.appendChild(vPIS);
			vPIS.setTextContent(String.valueOf(pisTotal));
			// vCOFINS
			Element vCOFINS = doc.createElement("vCOFINS");
			elementICMSTot.appendChild(vCOFINS);
			vCOFINS.setTextContent(String.valueOf(cofinsTotal));
			// vOutro
			Element vOutro = doc.createElement("vOutro");
			elementICMSTot.appendChild(vOutro);

			// vNF
			Element vNF = doc.createElement("vNF");
			elementICMSTot.appendChild(vNF);
			vNF.setTextContent(bill.getBillTotal());

			// transp
			Element elementinTransp = doc.createElement("transp");
			elementinfNFe.appendChild(elementinTransp);
//inTransp
			Element modFrete = doc.createElement("modFrete");
			elementinTransp.appendChild(modFrete);

			// vol
			Element vol = doc.createElement("vol");
			elementinTransp.appendChild(vol);

			// qVol
			Element qVol = doc.createElement("qVol");
			vol.appendChild(qVol);

			// cobr
			Element elementinCobr = doc.createElement("cobr");
			elementinfNFe.appendChild(elementinCobr);

			// fat
			Element fat = doc.createElement("fat");
			elementinCobr.appendChild(fat);

			// nFat
			Element elementnFat = doc.createElement("nFat");
			fat.appendChild(elementnFat);

			// vOrig
			Element elementvOrig = doc.createElement("vOrig");
			fat.appendChild(elementvOrig);

			// vLiq
			Element elementvLiq = doc.createElement("vLiq");
			fat.appendChild(elementvLiq);

			// dup
			Element dup = doc.createElement("dup");
			elementinCobr.appendChild(dup);

			// vLiq
			Element elementnDup = doc.createElement("nDup");
			dup.appendChild(elementnDup);

			// dVenc
			Element elementdVenc = doc.createElement("dVenc");
			dup.appendChild(elementdVenc);

			// vDup
			Element elementvDup = doc.createElement("vDup");
			dup.appendChild(elementvDup);

			// pag
			Element elementinPag = doc.createElement("pag");
			elementinfNFe.appendChild(elementinPag);

			// detPag
			Element elementdetPag = doc.createElement("detPag");
			elementinPag.appendChild(elementdetPag);

			// detPag
			Element tPag = doc.createElement("tPag");
			elementdetPag.appendChild(tPag);

			// vPag
			Element vPag = doc.createElement("vPag");
			elementdetPag.appendChild(vPag);

			// infAdic
			Element elementinfAdic = doc.createElement("infAdic");
			elementinfNFe.appendChild(elementinfAdic);

			Element infCpl = doc.createElement("infCpl");
			elementinfAdic.appendChild(infCpl);

			// write the content into xml file

		} catch (ParserConfigurationException pce) {
			pce.printStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("CreateWriteXMLFile class_ " + pce.toString());
		} catch (Exception e) {
			e.printStackTrace();
			ViewFactory error = new ViewFactory();
			error.getErrorMess("CreateWriteXMLFile class_ " + e.toString());
		}

		return doc;
	}

	public BillBean getBill() {
		return bill;
	}

	public void setBill(BillBean bill) {
		CreateWriteXMLFile.bill = bill;
	}

	public ObservableList<ProductBeanXML> getProducts() {
		return products;
	}

	public void setProducts(ObservableList<ProductBeanXML> listOfProducts) {
		CreateWriteXMLFile.products = listOfProducts;
	}
}
