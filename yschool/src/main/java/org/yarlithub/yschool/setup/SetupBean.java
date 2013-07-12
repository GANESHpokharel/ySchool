package org.yarlithub.yschool.setup;

import org.apache.log4j.Logger;
import org.yarlithub.yschool.util.InitialDateLoaderUtil;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.lang.String;

/**
 * Created with IntelliJ IDEA.
 * User: jaykrish
 * Date: 4/25/13
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */

@ManagedBean
@SessionScoped
public class SetupBean implements Serializable {

    private static final Logger logger = Logger.getLogger(SetupBean.class);

    @ManagedProperty(value = "#{initialDateLoaderUtil}")
    private InitialDateLoaderUtil initialDateLoaderUtil;

    public String teststr;
    public String getTeststr() {
        return teststr;
    }

    public void setTeststr(String teststr) {
        this.teststr = teststr;
    }



    public SetupBean() {
        logger.info("initiating a new setup bean");

    }

    public void enterSetup() {
        logger.info("Entering into first time ySchool setup");
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, "setting up now.", null));

    }

    public void setInitialDateLoaderUtil(InitialDateLoaderUtil initialDateLoaderUtil) {
        this.initialDateLoaderUtil = initialDateLoaderUtil;
    }
}
