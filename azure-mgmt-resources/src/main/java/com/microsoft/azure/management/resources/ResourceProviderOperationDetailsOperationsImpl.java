/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.resources.models.ResourceProviderOperationDetailListResult;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseCallback;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.Response;
import retrofit.Retrofit;

/**
 * An instance of this class provides access to all the operations defined
 * in ResourceProviderOperationDetailsOperations.
 */
public final class ResourceProviderOperationDetailsOperationsImpl implements ResourceProviderOperationDetailsOperations {
    /** The Retrofit service to perform REST calls. */
    private ResourceProviderOperationDetailsService service;
    /** The service client containing this operation class. */
    private ResourceManagementClient client;

    /**
     * Initializes an instance of ResourceProviderOperationDetailsOperations.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ResourceProviderOperationDetailsOperationsImpl(Retrofit retrofit, ResourceManagementClient client) {
        this.service = retrofit.create(ResourceProviderOperationDetailsService.class);
        this.client = client;
    }

    /**
     * Gets a list of resource providers.
     *
     * @param resourceProviderNamespace Resource identity.
     * @param apiVersion the String value
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceProviderOperationDetailListResult object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ResourceProviderOperationDetailListResult> list(String resourceProviderNamespace, String apiVersion) throws CloudException, IOException, IllegalArgumentException {
        if (resourceProviderNamespace == null) {
            throw new IllegalArgumentException("Parameter resourceProviderNamespace is required and cannot be null.");
        }
        if (this.client.getSubscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null.");
        }
        if (apiVersion == null) {
            throw new IllegalArgumentException("Parameter apiVersion is required and cannot be null.");
        }
        Call<ResponseBody> call = service.list(resourceProviderNamespace, this.client.getSubscriptionId(), apiVersion, this.client.getAcceptLanguage());
        return listDelegate(call.execute(), null);
    }

    /**
     * Gets a list of resource providers.
     *
     * @param resourceProviderNamespace Resource identity.
     * @param apiVersion the String value
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> listAsync(String resourceProviderNamespace, String apiVersion, final ServiceCallback<ResourceProviderOperationDetailListResult> serviceCallback) {
        if (resourceProviderNamespace == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter resourceProviderNamespace is required and cannot be null."));
            return null;
        }
        if (this.client.getSubscriptionId() == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter this.client.getSubscriptionId() is required and cannot be null."));
            return null;
        }
        if (apiVersion == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter apiVersion is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.list(resourceProviderNamespace, this.client.getSubscriptionId(), apiVersion, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<ResourceProviderOperationDetailListResult>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<ResourceProviderOperationDetailListResult> listDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ResourceProviderOperationDetailListResult, CloudException>()
                .register(200, new TypeToken<ResourceProviderOperationDetailListResult>() { }.getType())
                .register(204, new TypeToken<ResourceProviderOperationDetailListResult>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

    /**
     * Gets a list of resource providers.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceProviderOperationDetailListResult object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<ResourceProviderOperationDetailListResult> listNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        return listNextDelegate(call.execute(), null);
    }

    /**
     * Gets a list of resource providers.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    public Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<ResourceProviderOperationDetailListResult> serviceCallback) {
        if (nextPageLink == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter nextPageLink is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.listNext(nextPageLink, this.client.getAcceptLanguage());
        call.enqueue(new ServiceResponseCallback<ResourceProviderOperationDetailListResult>(serviceCallback) {
            @Override
            public void onResponse(Response<ResponseBody> response, Retrofit retrofit) {
                try {
                    serviceCallback.success(listNextDelegate(response, retrofit));
                } catch (CloudException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return call;
    }

    private ServiceResponse<ResourceProviderOperationDetailListResult> listNextDelegate(Response<ResponseBody> response, Retrofit retrofit) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<ResourceProviderOperationDetailListResult, CloudException>()
                .register(200, new TypeToken<ResourceProviderOperationDetailListResult>() { }.getType())
                .register(204, new TypeToken<ResourceProviderOperationDetailListResult>() { }.getType())
                .registerError(CloudException.class)
                .build(response, retrofit);
    }

}