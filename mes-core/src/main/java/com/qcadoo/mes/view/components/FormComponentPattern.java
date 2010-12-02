package com.qcadoo.mes.view.components;

import com.qcadoo.mes.view.ComponentPattern;
import com.qcadoo.mes.view.ComponentState;
import com.qcadoo.mes.view.ViewComponent;
import com.qcadoo.mes.view.patterns.AbstractContainerPattern;

@ViewComponent("form")
public class FormComponentPattern extends AbstractContainerPattern {

    private static final String JSP_PATH = "newComponents/form.jsp";

    private static final String JS_OBJECT = "QCD.components.containers.Form";

    private static boolean hasHeader;

    private static String expression;

    // TODO opcje

    public FormComponentPattern(final String name, final String fieldPath, final String sourceFieldPath,
            final ComponentPattern parent) {
        super(name, fieldPath, sourceFieldPath, parent);
    }

    @Override
    public ComponentState getComponentStateInstance() {
        return new FormComponentState(expression);
    }

    @Override
    public String getJspFilePath() {
        return JSP_PATH;
    }

    @Override
    public String getJavaScriptFilePath() {
        return JS_PATH;
    }

    @Override
    public String getJavaScriptObjectName() {
        return JS_OBJECT;
    }

    public static boolean isHasHeader() {
        return hasHeader;
    }

}
