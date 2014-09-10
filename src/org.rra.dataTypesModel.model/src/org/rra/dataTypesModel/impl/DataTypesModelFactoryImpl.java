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
package org.rra.dataTypesModel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.rra.dataTypesModel.CompositeDataType;
import org.rra.dataTypesModel.CompositeTypeField;
import org.rra.dataTypesModel.ContainerDataType;
import org.rra.dataTypesModel.DataTypesModel;
import org.rra.dataTypesModel.DataTypesModelFactory;
import org.rra.dataTypesModel.DataTypesModelPackage;
import org.rra.dataTypesModel.EnumElement;
import org.rra.dataTypesModel.Enumerator;
import org.rra.dataTypesModel.MemberFunction;
import org.rra.dataTypesModel.NonMemberFunction;
import org.rra.dataTypesModel.PrimitiveDataType;
import org.rra.dataTypesModel.ROSMsgDataType;
import org.rra.dataTypesModel.ROSMsgField;
import org.rra.dataTypesModel.ROSMsgFunction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataTypesModelFactoryImpl extends EFactoryImpl implements DataTypesModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DataTypesModelFactory init() {
		try {
			DataTypesModelFactory theDataTypesModelFactory = (DataTypesModelFactory)EPackage.Registry.INSTANCE.getEFactory(DataTypesModelPackage.eNS_URI);
			if (theDataTypesModelFactory != null) {
				return theDataTypesModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DataTypesModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DataTypesModelPackage.DATA_TYPES_MODEL: return createDataTypesModel();
			case DataTypesModelPackage.PRIMITIVE_DATA_TYPE: return createPrimitiveDataType();
			case DataTypesModelPackage.COMPOSITE_DATA_TYPE: return createCompositeDataType();
			case DataTypesModelPackage.ROS_MSG_DATA_TYPE: return createROSMsgDataType();
			case DataTypesModelPackage.ENUMERATOR: return createEnumerator();
			case DataTypesModelPackage.ENUM_ELEMENT: return createEnumElement();
			case DataTypesModelPackage.CONTAINER_DATA_TYPE: return createContainerDataType();
			case DataTypesModelPackage.MEMBER_FUNCTION: return createMemberFunction();
			case DataTypesModelPackage.NON_MEMBER_FUNCTION: return createNonMemberFunction();
			case DataTypesModelPackage.ROS_MSG_FUNCTION: return createROSMsgFunction();
			case DataTypesModelPackage.ROS_MSG_FIELD: return createROSMsgField();
			case DataTypesModelPackage.COMPOSITE_TYPE_FIELD: return createCompositeTypeField();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesModel createDataTypesModel() {
		DataTypesModelImpl dataTypesModel = new DataTypesModelImpl();
		return dataTypesModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveDataType createPrimitiveDataType() {
		PrimitiveDataTypeImpl primitiveDataType = new PrimitiveDataTypeImpl();
		return primitiveDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeDataType createCompositeDataType() {
		CompositeDataTypeImpl compositeDataType = new CompositeDataTypeImpl();
		return compositeDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerDataType createContainerDataType() {
		ContainerDataTypeImpl containerDataType = new ContainerDataTypeImpl();
		return containerDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberFunction createMemberFunction() {
		MemberFunctionImpl memberFunction = new MemberFunctionImpl();
		return memberFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonMemberFunction createNonMemberFunction() {
		NonMemberFunctionImpl nonMemberFunction = new NonMemberFunctionImpl();
		return nonMemberFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMsgFunction createROSMsgFunction() {
		ROSMsgFunctionImpl rosMsgFunction = new ROSMsgFunctionImpl();
		return rosMsgFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMsgField createROSMsgField() {
		ROSMsgFieldImpl rosMsgField = new ROSMsgFieldImpl();
		return rosMsgField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeTypeField createCompositeTypeField() {
		CompositeTypeFieldImpl compositeTypeField = new CompositeTypeFieldImpl();
		return compositeTypeField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSMsgDataType createROSMsgDataType() {
		ROSMsgDataTypeImpl rosMsgDataType = new ROSMsgDataTypeImpl();
		return rosMsgDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createEnumerator() {
		EnumeratorImpl enumerator = new EnumeratorImpl();
		return enumerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumElement createEnumElement() {
		EnumElementImpl enumElement = new EnumElementImpl();
		return enumElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesModelPackage getDataTypesModelPackage() {
		return (DataTypesModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DataTypesModelPackage getPackage() {
		return DataTypesModelPackage.eINSTANCE;
	}

} //DataTypesModelFactoryImpl
