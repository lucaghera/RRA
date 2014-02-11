package org.rra.cdmmodel.xtext.utils;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class CDMModelRuntimeModule extends AbstractGenericResourceRuntimeModule{
	
	
    @Override
    protected String getLanguageName() {
        return "org.rra.cdmModel.presentation.CDMModelEditorID";
    }
 
    @Override
    protected String getFileExtensions() {
    	System.out.println("------------- cdmmodel");
        return "cdmmodel";
    }
 
    public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
        return CDMModelResourceDescriptionStrategy.class;
    }
 
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return CDMModelQualifiedNameProvider.class;
    }

}
