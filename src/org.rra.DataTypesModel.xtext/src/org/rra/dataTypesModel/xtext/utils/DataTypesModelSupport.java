package org.rra.dataTypesModel.xtext.utils;

import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport;

import com.google.inject.Module;

public class DataTypesModelSupport extends AbstractGenericResourceSupport {
 
    @Override
    protected Module createGuiceModule() {
        return new DataTypesModelRuntimeModule();
    }
 
}