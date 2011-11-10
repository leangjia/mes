/**
 * ***************************************************************************
 * Copyright (c) 2010 Qcadoo Limited
 * Project: Qcadoo MES
 * Version: 0.4.9
 *
 * This file is part of Qcadoo.
 *
 * Qcadoo is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation; either version 3 of the License,
 * or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 * ***************************************************************************
 */
package com.qcadoo.mes.productionCounting.internal.constants;

public interface ProductionCountingConstants {

    public static final String PLUGIN_IDENTIFIER = "productionCounting";

    // MODEL
    public static final String MODEL_PRODUCTION_RECORD = "productionRecord";

    public static final String MODEL_PRODUCTION_BALANCE = "productionBalance";

    public static final String MODEL_PRODUCTION_COUNTING = "productionCounting";

    public static final String MODEL_RECORD_OPERATION_PRODUCT_IN_COMPONENT = "recordOperationProductInComponent";

    public static final String MODEL_RECORD_OPERATION_PRODUCT_OUT_COMPONENT = "recordOperationProductOutComponent";

    // VIEW
    public static final String VIEW_PRODUCTION_RECORDS_LIST = "productionRecordsList";

    public static final String VIEW_PRODUCTION_RECORD_DETAILS = "productionRecordDetails";

    public static final String VIEW_PRODUCTION_BALANCES_LIST = "productionBalancesList";

    public static final String VIEW_PRODUCTION_BALANCE_DETAILS = "productionBalanceDetails";

    public static final String VIEW_PRODUCTION_COUNTINGS_LIST = "productionCountingsList";

    public static final String VIEW_PRODUCTION_COUNTING_DETAILS = "productionCountingDetails";

    public static final String VIEW_RECORD_OPERATION_PRODUCT_IN_COMPONENT_DETAILS = "recordOperationProductInComponentDetails";

    public static final String VIEW_RECORD_OPERATION_PRODUCT_OUT_COMPONENT_DETAILS = "recordOperationProductOutComponentDetails";

    // RECORDING PARAMETERS
    public static final String PARAM_REGISTER_OUT_PRODUCTS = "registerQuantityOutProduct";

    public static final String PARAM_REGISTER_IN_PRODUCTS = "registerQuantityInProduct";

    public static final String PARAM_REGISTER_TIME = "registerProductionTime";

    public final static String PARAM_RECORDING_TYPE_NONE = "01none";

    public final static String PARAM_RECORDING_TYPE_CUMULATED = "02cumulated";

    public final static String PARAM_RECORDING_TYPE_FOREACH = "03forEach";

    public final static String PARAM_RECORDING_TYPE_BASIC = "01basic";
}