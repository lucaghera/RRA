package org.rra.runtimeFeatureModel.xtext.ui;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.rra.runtimeFeatureModel.presentation.RuntimeFeatureModelEditor;

public class RuntimeFeatureModelEditorOpener extends LanguageSpecificURIEditorOpener {
 
    @Override
    protected void selectAndReveal(IEditorPart openEditor, URI uri,
            EReference crossReference, int indexInList, boolean select) {
    	RuntimeFeatureModelEditor runtimeFeatureModelEditor = (RuntimeFeatureModelEditor) openEditor.getAdapter(RuntimeFeatureModelEditor.class);
        if (runtimeFeatureModelEditor != null) {
            EObject eObject = runtimeFeatureModelEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
            runtimeFeatureModelEditor.setSelectionToViewer(Collections.singletonList(eObject));
        }
    }
 
}
