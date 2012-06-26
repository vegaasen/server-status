package com.vegaasen.status.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Simple status generator Controller
 * <p/>
 *
 * TODO: Create a simple REST-based service that provides either:
 * a) XML
 * b) JSON
 *
 * @author vegaasen
 */
@Controller
@RequestMapping("/")
public class HTPwdController {

    private static final String MT_TEXT_RICH = "text/richtext";
    private static final String UTF_8 = "UTF-8";

    /**
     * Handle requests for processing an status to be used together with the apache-ftp-server
     * (or in other cases where status needs to be used)
     *
     * @param request  _
     * @param response _
     * @return jsp-mapping
     */
    @RequestMapping(value = "generator", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelAndView handleGenerateRequest(final HttpServletRequest request, HttpServletResponse response) {
        ModelAndView view = new ModelAndView("generator");
        return view;
    }

}
