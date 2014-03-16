package org.rra.dataTypesModel.xtext.ui;

import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.ui.IEditorPart;
import org.eclipse.xtext.ui.editor.LanguageSpecificURIEditorOpener;
import org.rra.dataTypesModel.presentation.DataTypesModelEditor;

public class DataTypesModelEditorOpener extends LanguageSpecificURIEditorOpener {
 
    @Override
    protected void selectAndReveal(IEditorPart openEditor, URI uri,
            EReference crossReference, int indexInList, boolean select) {
    	DataTypesModelEditor dataTypesModelEditor = (DataTypesModelEditor) openEditor.getAdapter(DataTypesModelEditor.class);
        if (dataTypesModelEditor != null) {
            EObject eObject = dataTypesModelEditor.getEditingDomain().getResourceSet().getEObject(uri, true);
            dataTypesModelEditor.setSelectionToViewer(Collections.singletonList(eObject));
        }
    }
 
}
