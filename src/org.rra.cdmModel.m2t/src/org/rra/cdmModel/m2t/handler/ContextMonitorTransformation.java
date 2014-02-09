/**
 * Robotics Runtime Adaptation Toolchain
 * 
 * Copyright (c) 2014
 * All rights reserved.
 * 
 * Luca Gherardi
 * Instititute for Dynamic Systems and Control
 * ETH Zurich
 * 
 * Nico Hochgeschwender
 * Department of Computer Science
 * Bonn-Rhine-Sieg University of Applied Sciences
 * 
 * ***********************************************************************************************
 * 
 * Authors: 
 *    <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 *    <A HREF="mailto:nico.hochgeschwender@h-brs.de">Nico Hochgeschwender</A>
 * 
 * 
 * ***********************************************************************************************
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 */
package org.rra.cdmModel.m2t.handler;

import java.io.IOException;
import java.net.URL;

import org.best_of_robotics.transform.service.parameter.IEglTransformParameter;
import org.best_of_robotics.transform.service.parameter.TransformParameterFactory;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PlatformUI;
import org.hyperflex.m2t.EGLTransformer;
import org.rra.cdmModel.m2t.Activator;

public class ContextMonitorTransformation extends AbstractHandler {
	
	public ContextMonitorTransformation() {	
		
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IFile sourcefile = null;
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor != null) {
            IEditorInput input = editor.getEditorInput();
            if (input instanceof IFileEditorInput) {
            	sourcefile = ((IFileEditorInput)input).getFile();
            	System.out.println("File from editor: " + sourcefile.getLocation().toOSString());
            	if(sourcefile.getFileExtension().compareTo("cdmmodel") != 0){
            		
            		sourcefile = null;
            		MessageDialog
					.openError(
							PlatformUI.getWorkbench()
									.getActiveWorkbenchWindow().getShell(),
							"Error on Editor Selection 2",
							"Please select the editor from which you want to generate code and execute command again.");
            	}
                
            }
            
        }
		
				
		if(sourcefile == null)
			return null;
		
		
		URL url = Platform.getBundle(Activator.PLUGIN_ID).getEntry("epsilon/main.egl");
		String fileURL = "";
		try {
			fileURL = FileLocator.toFileURL(url).toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		
		IEglTransformParameter eglTransformParameter = TransformParameterFactory.createEglTransformParameter();
		eglTransformParameter.setTransformName("Context Monitor generation");
		eglTransformParameter.setEglTransform(fileURL);
		eglTransformParameter.setPluginID(Activator.PLUGIN_ID);
		eglTransformParameter.setSourceMetaModelURI("http://www.rra.org/cdmmodel");
		eglTransformParameter.setSourceModelFilePath(sourcefile.getLocation().toOSString());
		eglTransformParameter.setSourceName("Source");
		eglTransformParameter.setSourceReadOnLoad(true);
		eglTransformParameter.setSourceStoreOnDisposal(false);
		
		eglTransformParameter.setOutputRoot("file:" + sourcefile.getProject().getLocation().toOSString());
		
		//get transform service
		
		//do transform
		EGLTransformer transformer = new EGLTransformer(eglTransformParameter);
		transformer.transform();
		
		return null;
	}

}
