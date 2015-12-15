/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

/*
* Generated file
*
* Generated from: yang module name: remote-rpc-connector yang module local name: remote-rpc-connector
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Mon Jul 07 17:02:25 PDT 2014
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.controller.config.yang.config.remote_rpc_connector;


import org.opendaylight.controller.config.api.DependencyResolver;
import org.opendaylight.controller.config.api.DynamicMBeanWithInstance;
import org.opendaylight.controller.config.spi.Module;
import org.osgi.framework.BundleContext;

public class RemoteRPCBrokerModuleFactory extends org.opendaylight.controller.config.yang.config.remote_rpc_connector.AbstractRemoteRPCBrokerModuleFactory {
  @Override
  public Module createModule(String instanceName, DependencyResolver dependencyResolver, BundleContext bundleContext) {
    RemoteRPCBrokerModule module = (RemoteRPCBrokerModule)super.createModule(instanceName,dependencyResolver,bundleContext);
    module.setBundleContext(bundleContext);
    return module;
  }

  @Override
  public Module createModule(String instanceName, DependencyResolver dependencyResolver,
                             DynamicMBeanWithInstance old, BundleContext bundleContext) throws Exception {
    RemoteRPCBrokerModule module = (RemoteRPCBrokerModule)super.createModule(instanceName, dependencyResolver,
        old, bundleContext);
    module.setBundleContext(bundleContext);
    return module;
  }
}
