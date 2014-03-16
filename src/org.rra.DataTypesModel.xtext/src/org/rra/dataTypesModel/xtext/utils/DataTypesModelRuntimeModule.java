package org.rra.dataTypesModel.xtext.utils;

import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;

public class DataTypesModelRuntimeModule extends AbstractGenericResourceRuntimeModule{
	
	
    @Override
    protected String getLanguageName() {
        return "org.rra.dataTypesModel.presentation.DataTypesModelEditorID";
    }
 
    @Override
    protected String getFileExtensions() {
    	return "datatypesmodel";
    }
 
    public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
        return DataTypesModelResourceDescriptionStrategy.class;
    }
 
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return DataTypesModelQualifiedNameProvider.class;
    }

}
