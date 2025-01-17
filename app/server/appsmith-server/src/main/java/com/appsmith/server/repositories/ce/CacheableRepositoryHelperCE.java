package com.appsmith.server.repositories.ce;

import com.appsmith.server.domains.Tenant;
import com.appsmith.server.domains.User;
import reactor.core.publisher.Mono;

import java.util.Set;

public interface CacheableRepositoryHelperCE {

    Mono<Set<String>> getPermissionGroupsOfUser(User user);

    Mono<Set<String>> preFillAnonymousUserPermissionGroupIdsCache();

    Mono<Set<String>> getPermissionGroupsOfAnonymousUser();

    Mono<Void> evictPermissionGroupsUser(String email, String tenantId);

    Mono<String> getDefaultTenantId();

    Mono<String> getInstanceAdminPermissionGroupId();

    Mono<Tenant> fetchDefaultTenant(String tenantId);

    Mono<Void> evictCachedTenant(String tenantId);
}
