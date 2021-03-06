/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.instance.spi.microservice;

import com.sitewhere.instance.spi.instance.grpc.IInstanceManagementGrpcServer;
import com.sitewhere.instance.spi.templates.IInstanceTemplateManager;
import com.sitewhere.instance.spi.tenant.grpc.ITenantManagementGrpcServer;
import com.sitewhere.instance.spi.tenant.kafka.ITenantBootstrapModelConsumer;
import com.sitewhere.instance.spi.tenant.templates.IDatasetTemplateManager;
import com.sitewhere.instance.spi.tenant.templates.ITenantTemplateManager;
import com.sitewhere.instance.spi.user.grpc.IUserManagementGrpcServer;
import com.sitewhere.spi.microservice.IFunctionIdentifier;
import com.sitewhere.spi.microservice.IGlobalMicroservice;
import com.sitewhere.spi.microservice.scripting.IScriptSynchronizer;
import com.sitewhere.spi.user.IUserManagement;

/**
 * API for instance management microservice.
 */
public interface IInstanceManagementMicroservice<T extends IFunctionIdentifier> extends IGlobalMicroservice<T> {

    /**
     * Get instance template manager instance.
     * 
     * @return
     */
    public IInstanceTemplateManager getInstanceTemplateManager();

    /**
     * Get instance script synchronizer.
     * 
     * @return
     */
    public IScriptSynchronizer getInstanceScriptSynchronizer();

    /**
     * Get instance management gRPC server.
     * 
     * @return
     */
    public IInstanceManagementGrpcServer getInstanceManagementGrpcServer();

    /**
     * Get user management implementation.
     * 
     * @return
     */
    public IUserManagement getUserManagement();

    /**
     * Get user management gRPC server.
     * 
     * @return
     */
    public IUserManagementGrpcServer getUserManagementGrpcServer();

    /**
     * Get tenant management gRPC server.
     * 
     * @return
     */
    public ITenantManagementGrpcServer getTenantManagementGrpcServer();

    /**
     * Get tenant template manager.
     * 
     * @return
     */
    public ITenantTemplateManager getTenantConfigurationTemplateManager();

    /**
     * Get tenant dataset template manager.
     * 
     * @return
     */
    public IDatasetTemplateManager getTenantDatasetTemplateManager();

    /**
     * Get tenant bootstrap model producer.
     * 
     * @return
     */
    public ITenantBootstrapModelConsumer getTenantBootstrapModelConsumer();
}
