package com.google.cloud.tools.gradle.endpoints.framework;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(initParams = {@WebInitParam(name = "services", value = "expectedApiClassAlpha")})
class TestAnnotatedServletAlpha {}
