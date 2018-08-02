package com.vp.plugin.sample.mindMapPlugin;

import java.awt.Color;
import java.awt.Point;

import com.vp.plugin.ApplicationManager;
import com.vp.plugin.DiagramManager;
import com.vp.plugin.action.VPAction;
import com.vp.plugin.action.VPActionController;
import com.vp.plugin.diagram.IDiagramTypeConstants;
import com.vp.plugin.diagram.IDiagramUIModel;
import com.vp.plugin.diagram.shape.IMindMapNodeUIModel;
import com.vp.plugin.model.IMindConnector;
import com.vp.plugin.model.IMindMapNode;
import com.vp.plugin.model.factory.IModelElementFactory;

public class MindMapAction  implements VPActionController{

	@Override
	public void performAction(VPAction arg0) {
		//Create Blank Mind Map
		DiagramManager diagramManager = ApplicationManager.instance().getDiagramManager();
		IDiagramUIModel mindMap = (IDiagramUIModel) diagramManager.createDiagram(IDiagramTypeConstants.DIAGRAM_TYPE_MIND_MAP_DIAGRAM);
		mindMap.setName("Sample Mind Map");
		
		//Create node for product launch
		IMindMapNode productLaunch = IModelElementFactory.instance().createMindMapNode();
		productLaunch.setName("Product Launch");
		//Create the node shape on diagram
		IMindMapNodeUIModel shapeProductLaunch = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, productLaunch);
		shapeProductLaunch.setBounds(450, 240, 250, 35);
		//set the font size if you want the text larger/smaller than default
		shapeProductLaunch.getElementFont().setSize(25);
		//set the color for the node, you don't have to call this method if you want it to be black 
		shapeProductLaunch.getLineModel().setColor(Color.black);
		//Call to re-calculate caption position when render the diagram
		shapeProductLaunch.resetCaption();
		
		IMindMapNode development = IModelElementFactory.instance().createMindMapNode();
		development.setName("Development");
		IMindMapNodeUIModel shapeDevelopment = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, development);
		shapeDevelopment.setBounds(400, 150, 110, 30);
		shapeDevelopment.getLineModel().setColor(Color.blue);
		shapeDevelopment.resetCaption();
		
		IMindMapNode developmentFinishTesting = IModelElementFactory.instance().createMindMapNode();
		developmentFinishTesting.setName("Finish testing");
		IMindMapNodeUIModel shapeDevelopmentFinishTesting = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, developmentFinishTesting);
		shapeDevelopmentFinishTesting.setBounds(230, 100, 150, 30);
		shapeDevelopmentFinishTesting.getLineModel().setColor(Color.blue);
		shapeDevelopmentFinishTesting.resetCaption();
		
		IMindMapNode developmentPerfromIntegration = IModelElementFactory.instance().createMindMapNode();
		developmentPerfromIntegration.setName("Perform integration");
		IMindMapNodeUIModel shapeDevelopmentPerformIntegration = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, developmentPerfromIntegration);
		shapeDevelopmentPerformIntegration.setBounds(180, 150, 200, 30);
		shapeDevelopmentPerformIntegration.getLineModel().setColor(Color.blue);
		shapeDevelopmentPerformIntegration.resetCaption();
		
		IMindMapNode developmentClearTickets = IModelElementFactory.instance().createMindMapNode();
		developmentClearTickets.setName("Clear outstanding tickets");
		IMindMapNodeUIModel shapeDevelopmentClearTickets = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, developmentClearTickets);
		shapeDevelopmentClearTickets.setBounds(130, 200, 250, 30);
		shapeDevelopmentClearTickets.getLineModel().setColor(Color.blue);
		shapeDevelopmentClearTickets.resetCaption();
		
		IMindMapNode sales = IModelElementFactory.instance().createMindMapNode();
		sales.setName("Sales");
		IMindMapNodeUIModel shapeSales = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, sales);
		shapeSales.setBounds(400, 300, 60, 30);
		shapeSales.getLineModel().setColor(Color.magenta);
		shapeSales.resetCaption();
		
		IMindMapNode salesEmailAffiliaties = IModelElementFactory.instance().createMindMapNode();
		salesEmailAffiliaties.setName("Email affiliaties");
		IMindMapNodeUIModel shapeSalesEmailAffiliaties = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, salesEmailAffiliaties);
		shapeSalesEmailAffiliaties.setBounds(230, 275, 150, 30);
		shapeSalesEmailAffiliaties.getLineModel().setColor(Color.magenta);
		shapeSalesEmailAffiliaties.resetCaption();
		
		IMindMapNode salesUpdateFeature = IModelElementFactory.instance().createMindMapNode();
		salesUpdateFeature.setName("Update partners about the new feature");
		IMindMapNodeUIModel shapeSalesUpdateFeature = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, salesUpdateFeature);
		shapeSalesUpdateFeature.setBounds(55, 325, 325, 30);
		shapeSalesUpdateFeature.getLineModel().setColor(Color.magenta);
		shapeSalesUpdateFeature.resetCaption();
		
		IMindMapNode info = IModelElementFactory.instance().createMindMapNode();
		info.setName("Info");
		IMindMapNodeUIModel shapeInfo = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, info);
		shapeInfo.setBounds(700, 100, 50, 30);
		shapeInfo.getLineModel().setColor(new Color(139,69,19));
		shapeInfo.resetCaption();
		
		IMindMapNode infoProjectName = IModelElementFactory.instance().createMindMapNode();
		infoProjectName.setName("Project name: Shopping Cart Enhancement");
		IMindMapNodeUIModel shapeInfoProjectName = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, infoProjectName);
		shapeInfoProjectName.setBounds(770, 25, 350, 30);
		shapeInfoProjectName.getLineModel().setColor(new Color(139,69,19));
		shapeInfoProjectName.resetCaption();
		
		IMindMapNode infoStartDate = IModelElementFactory.instance().createMindMapNode();
		infoStartDate.setName("Start date: 8th Jun, 2017");
		IMindMapNodeUIModel shapeInfoStartDate = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, infoStartDate);
		shapeInfoStartDate.setBounds(770, 75, 200, 30);
		shapeInfoStartDate.getLineModel().setColor(new Color(139,69,19));
		shapeInfoStartDate.resetCaption();
		
		IMindMapNode infoPlannedEndDate = IModelElementFactory.instance().createMindMapNode();
		infoPlannedEndDate.setName("Planned end date: 20th Aug, 2017");
		IMindMapNodeUIModel shapeInfoPlannedEndDate = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, infoPlannedEndDate);
		shapeInfoPlannedEndDate.setBounds(770, 125, 250, 30);
		shapeInfoPlannedEndDate.getLineModel().setColor(new Color(139,69,19));
		shapeInfoPlannedEndDate.resetCaption();
		
		IMindMapNode infoProjectManager = IModelElementFactory.instance().createMindMapNode();
		infoProjectManager.setName("Project manager: Steven");
		IMindMapNodeUIModel shapeInfoProjectManager = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, infoProjectManager);
		shapeInfoProjectManager.setBounds(770, 175, 200, 30);
		shapeInfoProjectManager.getLineModel().setColor(new Color(139,69,19));
		shapeInfoProjectManager.resetCaption();
		
		
		IMindMapNode marketing = IModelElementFactory.instance().createMindMapNode();
		marketing.setName("Marketing");
		IMindMapNodeUIModel shapeMarketing = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, marketing);
		shapeMarketing.setBounds(700, 350, 100, 30);
		shapeMarketing.getLineModel().setColor(Color.cyan);
		shapeMarketing.resetCaption();
		
		IMindMapNode marketingSocialMedia = IModelElementFactory.instance().createMindMapNode();
		marketingSocialMedia.setName("Post announcement on social media pages");
		IMindMapNodeUIModel shapeMarketingSocialMedia = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, marketingSocialMedia);
		shapeMarketingSocialMedia.setBounds(820, 300, 350, 30);
		shapeMarketingSocialMedia.getLineModel().setColor(Color.cyan);
		shapeMarketingSocialMedia.resetCaption();
		
		IMindMapNode socialMediaFacebook = IModelElementFactory.instance().createMindMapNode();
		socialMediaFacebook.setName("Facebook");
		IMindMapNodeUIModel shapeSocialMediaFacebook = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, socialMediaFacebook);
		shapeSocialMediaFacebook.setBounds(1190, 250, 100, 30);
		shapeSocialMediaFacebook.getLineModel().setColor(Color.cyan);
		shapeSocialMediaFacebook.resetCaption();
		
		IMindMapNode socialMediaInstagram = IModelElementFactory.instance().createMindMapNode();
		socialMediaInstagram.setName("Instagram");
		IMindMapNodeUIModel shapeSocialMediaInstagram = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, socialMediaInstagram);
		shapeSocialMediaInstagram.setBounds(1190, 300, 100, 30);
		shapeSocialMediaInstagram.getLineModel().setColor(Color.cyan);
		shapeSocialMediaInstagram.resetCaption();
		
		IMindMapNode socialMediaLinkedIn = IModelElementFactory.instance().createMindMapNode();
		socialMediaLinkedIn.setName("LinkedIn");
		IMindMapNodeUIModel shapeSocialMediaLinkedIn = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, socialMediaLinkedIn);
		shapeSocialMediaLinkedIn.setBounds(1190, 350, 100, 30);
		shapeSocialMediaLinkedIn.getLineModel().setColor(Color.cyan);
		shapeSocialMediaLinkedIn.resetCaption();
		
		IMindMapNode marketingWriteTutorial = IModelElementFactory.instance().createMindMapNode();
		marketingWriteTutorial.setName("Write tutorial");
		IMindMapNodeUIModel shapeMarketingWriteTutorial = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, marketingWriteTutorial);
		shapeMarketingWriteTutorial.setBounds(820, 400, 150, 30);
		shapeMarketingWriteTutorial.getLineModel().setColor(Color.cyan);
		shapeMarketingWriteTutorial.resetCaption();
		
		IMindMapNode marketingProduceTutorialVideo = IModelElementFactory.instance().createMindMapNode();
		marketingProduceTutorialVideo.setName("Produce tutorial video");
		IMindMapNodeUIModel shapeMarketingProduceTutorialVideo = (IMindMapNodeUIModel) diagramManager.createDiagramElement(mindMap, marketingProduceTutorialVideo);
		shapeMarketingProduceTutorialVideo.setBounds(820, 450, 200, 30);
		shapeMarketingProduceTutorialVideo.getLineModel().setColor(Color.cyan);
		shapeMarketingProduceTutorialVideo.resetCaption();
		
		
		//Create connector
		IMindConnector productLaunchToSales = IModelElementFactory.instance().createMindConnector();
		//The connector will connect from the product launch node...
		productLaunchToSales.setFrom(productLaunchToSales);
		//...to the sales node
		productLaunchToSales.setTo(sales);
		//create the connector shape on diagram
		diagramManager.createConnector(mindMap, productLaunchToSales, shapeProductLaunch, shapeSales, new Point[] {});
		
		IMindConnector productLaunchToDevelopment = IModelElementFactory.instance().createMindConnector();
		productLaunchToDevelopment.setFrom(productLaunch);
		productLaunchToDevelopment.setTo(development);
		diagramManager.createConnector(mindMap, productLaunchToDevelopment, shapeProductLaunch, shapeDevelopment, new Point[] {});
		
		IMindConnector productLaunchToInfo = IModelElementFactory.instance().createMindConnector();
		productLaunchToInfo.setFrom(productLaunch);
		productLaunchToInfo.setTo(info);
		diagramManager.createConnector(mindMap, productLaunchToInfo, shapeProductLaunch, shapeInfo, new Point[] {});
		
		IMindConnector productLaunchToMarketing = IModelElementFactory.instance().createMindConnector();
		productLaunchToMarketing.setFrom(productLaunch);
		productLaunchToMarketing.setTo(marketing);
		diagramManager.createConnector(mindMap, productLaunchToMarketing, shapeProductLaunch, shapeMarketing, new Point[] {});
		
		IMindConnector developmentToFinishTesting = IModelElementFactory.instance().createMindConnector();
		developmentToFinishTesting.setFrom(development);
		developmentToFinishTesting.setTo(developmentFinishTesting);
		diagramManager.createConnector(mindMap, developmentToFinishTesting, shapeDevelopment, shapeDevelopmentFinishTesting, new Point[] {});
		
		IMindConnector developmentToPerformIntegration = IModelElementFactory.instance().createMindConnector();
		developmentToPerformIntegration.setFrom(development);
		developmentToPerformIntegration.setTo(developmentPerfromIntegration);
		diagramManager.createConnector(mindMap, developmentToPerformIntegration, shapeDevelopment, shapeDevelopmentPerformIntegration, new Point[] {});
		
		IMindConnector developmentToClearTickets = IModelElementFactory.instance().createMindConnector();
		developmentToClearTickets.setFrom(development);
		developmentToClearTickets.setTo(developmentClearTickets);
		diagramManager.createConnector(mindMap, developmentToClearTickets, shapeDevelopment, shapeDevelopmentClearTickets, new Point[] {});
		
		IMindConnector salesToEmail = IModelElementFactory.instance().createMindConnector();
		salesToEmail.setFrom(sales);
		salesToEmail.setTo(salesEmailAffiliaties);
		diagramManager.createConnector(mindMap, salesToEmail, shapeSales, shapeSalesEmailAffiliaties, new Point[] {});
		
		IMindConnector salesToUpdate = IModelElementFactory.instance().createMindConnector();
		salesToUpdate.setFrom(sales);
		salesToUpdate.setFrom(salesUpdateFeature);
		diagramManager.createConnector(mindMap, salesToUpdate, shapeSales, shapeSalesUpdateFeature, new Point[] {});
		
		IMindConnector infoToProjectName = IModelElementFactory.instance().createMindConnector();
		infoToProjectName.setFrom(info);
		infoToProjectName.setTo(infoProjectName);
		diagramManager.createConnector(mindMap, infoToProjectName, shapeInfo, shapeInfoProjectName, new Point[] {});
		
		IMindConnector infoToStartDate = IModelElementFactory.instance().createMindConnector();
		infoToStartDate.setFrom(info);
		infoToStartDate.setTo(infoToStartDate);
		diagramManager.createConnector(mindMap, infoToStartDate, shapeInfo, shapeInfoStartDate, new Point[] {});
		
		IMindConnector infoToPlannedEnd = IModelElementFactory.instance().createMindConnector();
		infoToPlannedEnd.setFrom(info);
		infoToPlannedEnd.setTo(infoPlannedEndDate);
		diagramManager.createConnector(mindMap, infoToPlannedEnd, shapeInfo, shapeInfoPlannedEndDate, new Point[] {});
		
		IMindConnector infoToProjectManager = IModelElementFactory.instance().createMindConnector();
		infoToProjectManager.setFrom(info);
		infoToProjectManager.setTo(infoProjectManager);
		diagramManager.createConnector(mindMap, infoToProjectManager, shapeInfo, shapeInfoProjectManager, new Point[] {});
		
		IMindConnector marketingToSocialMedia = IModelElementFactory.instance().createMindConnector();
		marketingToSocialMedia.setFrom(marketing);
		marketingToSocialMedia.setTo(marketingSocialMedia);
		diagramManager.createConnector(mindMap, marketingToSocialMedia, shapeMarketing, shapeMarketingSocialMedia, new Point[] {});
		
		IMindConnector socialMediaToFacebook = IModelElementFactory.instance().createMindConnector();
		socialMediaToFacebook.setFrom(marketingSocialMedia);
		socialMediaToFacebook.setTo(socialMediaFacebook);
		diagramManager.createConnector(mindMap, socialMediaToFacebook, shapeMarketingSocialMedia, shapeSocialMediaFacebook, new Point[] {});
		
		IMindConnector socialMediaToInstagram = IModelElementFactory.instance().createMindConnector();
		socialMediaToInstagram.setFrom(marketingSocialMedia);
		socialMediaToInstagram.setTo(socialMediaInstagram);
		diagramManager.createConnector(mindMap, socialMediaToInstagram, shapeMarketingSocialMedia, shapeSocialMediaInstagram, new Point[] {});
		
		IMindConnector socialMediaToLinkedIn = IModelElementFactory.instance().createMindConnector();
		socialMediaToLinkedIn.setFrom(marketingSocialMedia);
		socialMediaToLinkedIn.setTo(socialMediaLinkedIn);
		diagramManager.createConnector(mindMap, socialMediaToLinkedIn, shapeMarketingSocialMedia, shapeSocialMediaLinkedIn, new Point[] {});
		
		IMindConnector marketingToWriteTutorial = IModelElementFactory.instance().createMindConnector();
		marketingToWriteTutorial.setFrom(marketing);
		marketingToWriteTutorial.setTo(marketingWriteTutorial);
		diagramManager.createConnector(mindMap, marketingToWriteTutorial, shapeMarketing, shapeMarketingWriteTutorial, new Point[] {});
		
		IMindConnector marketingToProduceVideo = IModelElementFactory.instance().createMindConnector();
		marketingToProduceVideo.setFrom(marketing);
		marketingToProduceVideo.setTo(marketingProduceTutorialVideo);
		diagramManager.createConnector(mindMap, marketingToProduceVideo, shapeMarketing, shapeMarketingProduceTutorialVideo, new Point[] {});
		
		//Show up diagram
		diagramManager.openDiagram(mindMap);
		
	}

	@Override
	public void update(VPAction arg0) {
		// TODO Auto-generated method stub
		
	}

}
