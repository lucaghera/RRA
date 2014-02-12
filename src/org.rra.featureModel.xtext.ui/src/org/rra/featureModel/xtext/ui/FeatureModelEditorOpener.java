package org.rra.featureModel.xtext.ui;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.hyperflex.featuremodels.presentation.featuremodelsEditor;

public class FeatureModelEditorOpener extends LanguageSpecificURIEditorOpener {
 
    @Override
    protected void selectAndReveal(IEditorPart openEditor, URI uri,
            EReference crossReference, int indexInList, boolean select) {
    	featuremodelsEditor cdmModelEditor = (featuremodelsEditor) openEditor.getAdapter(featuremodelsEditor.class);
        if (cdmModelEditor != null) {
            EObject eObject = cdmModelEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
            cdmModelEditor.setSelectionToViewer(Collections.singletonList(eObject));
        }
    }
 
}
