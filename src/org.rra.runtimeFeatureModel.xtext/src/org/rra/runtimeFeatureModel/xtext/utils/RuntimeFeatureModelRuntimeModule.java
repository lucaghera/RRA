package org.rra.runtimeFeatureModel.xtext.utils;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class RuntimeFeatureModelRuntimeModule extends AbstractGenericResourceRuntimeModule{
	
	
    @Override
    protected String getLanguageName() {
        return "org.hyperflex.featuremodels.presentation.featuremodelsEditorID";
    }
 
    @Override
    protected String getFileExtensions() {
    	return "featuremodel";
    }
 
    public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
        return RuntimeFeatureModelResourceDescriptionStrategy.class;
    }
 
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return RuntimeFeatureModelQualifiedNameProvider.class;
    }

}
