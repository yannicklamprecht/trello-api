package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.model.Organizations;
import io.swagger.client.model.OrganizationsDesc;
import io.swagger.client.model.OrganizationsDisplayName;
import io.swagger.client.model.OrganizationsLogo;
import io.swagger.client.model.OrganizationsMembers;
import io.swagger.client.model.OrganizationsMembersDeactivated;
import io.swagger.client.model.OrganizationsMemberships;
import io.swagger.client.model.OrganizationsName;
import io.swagger.client.model.OrganizationsWebsite;
import io.swagger.client.model.PrefsAssociatedDomain;
import io.swagger.client.model.PrefsBoardVisibilityRestrict;
import io.swagger.client.model.PrefsExternalMembersDisabled;
import io.swagger.client.model.PrefsGoogleAppsVersion;
import io.swagger.client.model.PrefsOrgInviteRestrict;
import io.swagger.client.model.PrefsPermissionLevel;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OrganizationApi
 */
public class OrganizationApiTest {

    private OrganizationApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(OrganizationApi.class);
    }


    /**
     * addOrganizations()
     *
     * 
     */
    @Test
    public void addOrganizationsTest() {
        Organizations body = null;
        String key = null;
        String token = null;
        // Void response = api.addOrganizations(body, key, token);

        // TODO: test validations
    }

    /**
     * addOrganizationsLogoByIdOrg()
     *
     * 
     */
    @Test
    public void addOrganizationsLogoByIdOrgTest() {
        OrganizationsLogo body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.addOrganizationsLogoByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * deleteOrganizationsByIdOrg()
     *
     * 
     */
    @Test
    public void deleteOrganizationsByIdOrgTest() {
        String idOrg = null;
        String key = null;
        String token = null;
        // Void response = api.deleteOrganizationsByIdOrg(idOrg, key, token);

        // TODO: test validations
    }

    /**
     * deleteOrganizationsLogoByIdOrg()
     *
     * 
     */
    @Test
    public void deleteOrganizationsLogoByIdOrgTest() {
        String idOrg = null;
        String key = null;
        String token = null;
        // Void response = api.deleteOrganizationsLogoByIdOrg(idOrg, key, token);

        // TODO: test validations
    }

    /**
     * deleteOrganizationsMembersAllByIdOrgByIdMember()
     *
     * 
     */
    @Test
    public void deleteOrganizationsMembersAllByIdOrgByIdMemberTest() {
        String idOrg = null;
        String idMember = null;
        String key = null;
        String token = null;
        // Void response = api.deleteOrganizationsMembersAllByIdOrgByIdMember(idOrg, idMember, key, token);

        // TODO: test validations
    }

    /**
     * deleteOrganizationsMembersByIdOrgByIdMember()
     *
     * 
     */
    @Test
    public void deleteOrganizationsMembersByIdOrgByIdMemberTest() {
        String idOrg = null;
        String idMember = null;
        String key = null;
        String token = null;
        // Void response = api.deleteOrganizationsMembersByIdOrgByIdMember(idOrg, idMember, key, token);

        // TODO: test validations
    }

    /**
     * deleteOrganizationsPrefsAssociatedDomainByIdOrg()
     *
     * 
     */
    @Test
    public void deleteOrganizationsPrefsAssociatedDomainByIdOrgTest() {
        String idOrg = null;
        String key = null;
        String token = null;
        // Void response = api.deleteOrganizationsPrefsAssociatedDomainByIdOrg(idOrg, key, token);

        // TODO: test validations
    }

    /**
     * deleteOrganizationsPrefsOrgInviteRestrictByIdOrg()
     *
     * 
     */
    @Test
    public void deleteOrganizationsPrefsOrgInviteRestrictByIdOrgTest() {
        String idOrg = null;
        String value = null;
        String key = null;
        String token = null;
        // Void response = api.deleteOrganizationsPrefsOrgInviteRestrictByIdOrg(idOrg, value, key, token);

        // TODO: test validations
    }

    /**
     * getOrganizationsActionsByIdOrg()
     *
     * 
     */
    @Test
    public void getOrganizationsActionsByIdOrgTest() {
        String idOrg = null;
        String key = null;
        String token = null;
        String entities = null;
        String display = null;
        String filter = null;
        String fields = null;
        String limit = null;
        String format = null;
        String since = null;
        String before = null;
        String page = null;
        String idModels = null;
        String member = null;
        String memberFields = null;
        String memberCreator = null;
        String memberCreatorFields = null;
        // Void response = api.getOrganizationsActionsByIdOrg(idOrg, key, token, entities, display, filter, fields, limit, format, since, before, page, idModels, member, memberFields, memberCreator, memberCreatorFields);

        // TODO: test validations
    }

    /**
     * getOrganizationsBoardsByIdOrg()
     *
     * 
     */
    @Test
    public void getOrganizationsBoardsByIdOrgTest() {
        String idOrg = null;
        String key = null;
        String token = null;
        String filter = null;
        String fields = null;
        String actions = null;
        String actionsEntities = null;
        String actionsLimit = null;
        String actionsFormat = null;
        String actionsSince = null;
        String actionFields = null;
        String memberships = null;
        String organization = null;
        String organizationFields = null;
        String lists = null;
        // Void response = api.getOrganizationsBoardsByIdOrg(idOrg, key, token, filter, fields, actions, actionsEntities, actionsLimit, actionsFormat, actionsSince, actionFields, memberships, organization, organizationFields, lists);

        // TODO: test validations
    }

    /**
     * getOrganizationsBoardsByIdOrgByFilter()
     *
     * 
     */
    @Test
    public void getOrganizationsBoardsByIdOrgByFilterTest() {
        String idOrg = null;
        String filter = null;
        String key = null;
        String token = null;
        // Void response = api.getOrganizationsBoardsByIdOrgByFilter(idOrg, filter, key, token);

        // TODO: test validations
    }

    /**
     * getOrganizationsByIdOrg()
     *
     * 
     */
    @Test
    public void getOrganizationsByIdOrgTest() {
        String idOrg = null;
        String key = null;
        String token = null;
        String actions = null;
        String actionsEntities = null;
        String actionsDisplay = null;
        String actionsLimit = null;
        String actionFields = null;
        String memberships = null;
        String membershipsMember = null;
        String membershipsMemberFields = null;
        String members = null;
        String memberFields = null;
        String memberActivity = null;
        String membersInvited = null;
        String membersInvitedFields = null;
        String boards = null;
        String boardFields = null;
        String boardActions = null;
        String boardActionsEntities = null;
        String boardActionsDisplay = null;
        String boardActionsFormat = null;
        String boardActionsSince = null;
        String boardActionsLimit = null;
        String boardActionFields = null;
        String boardLists = null;
        String paidAccount = null;
        String fields = null;
        // Void response = api.getOrganizationsByIdOrg(idOrg, key, token, actions, actionsEntities, actionsDisplay, actionsLimit, actionFields, memberships, membershipsMember, membershipsMemberFields, members, memberFields, memberActivity, membersInvited, membersInvitedFields, boards, boardFields, boardActions, boardActionsEntities, boardActionsDisplay, boardActionsFormat, boardActionsSince, boardActionsLimit, boardActionFields, boardLists, paidAccount, fields);

        // TODO: test validations
    }

    /**
     * getOrganizationsByIdOrgByField()
     *
     * 
     */
    @Test
    public void getOrganizationsByIdOrgByFieldTest() {
        String idOrg = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getOrganizationsByIdOrgByField(idOrg, field, key, token);

        // TODO: test validations
    }

    /**
     * getOrganizationsDeltasByIdOrg()
     *
     * 
     */
    @Test
    public void getOrganizationsDeltasByIdOrgTest() {
        String idOrg = null;
        String tags = null;
        String ixLastUpdate = null;
        String key = null;
        String token = null;
        // Void response = api.getOrganizationsDeltasByIdOrg(idOrg, tags, ixLastUpdate, key, token);

        // TODO: test validations
    }

    /**
     * getOrganizationsMembersByIdOrg()
     *
     * 
     */
    @Test
    public void getOrganizationsMembersByIdOrgTest() {
        String idOrg = null;
        String key = null;
        String token = null;
        String filter = null;
        String fields = null;
        String activity = null;
        // Void response = api.getOrganizationsMembersByIdOrg(idOrg, key, token, filter, fields, activity);

        // TODO: test validations
    }

    /**
     * getOrganizationsMembersByIdOrgByFilter()
     *
     * 
     */
    @Test
    public void getOrganizationsMembersByIdOrgByFilterTest() {
        String idOrg = null;
        String filter = null;
        String key = null;
        String token = null;
        // Void response = api.getOrganizationsMembersByIdOrgByFilter(idOrg, filter, key, token);

        // TODO: test validations
    }

    /**
     * getOrganizationsMembersCardsByIdOrgByIdMember()
     *
     * 
     */
    @Test
    public void getOrganizationsMembersCardsByIdOrgByIdMemberTest() {
        String idOrg = null;
        String idMember = null;
        String key = null;
        String token = null;
        String actions = null;
        String attachments = null;
        String attachmentFields = null;
        String members = null;
        String memberFields = null;
        String checkItemStates = null;
        String checklists = null;
        String board = null;
        String boardFields = null;
        String list = null;
        String listFields = null;
        String filter = null;
        String fields = null;
        // Void response = api.getOrganizationsMembersCardsByIdOrgByIdMember(idOrg, idMember, key, token, actions, attachments, attachmentFields, members, memberFields, checkItemStates, checklists, board, boardFields, list, listFields, filter, fields);

        // TODO: test validations
    }

    /**
     * getOrganizationsMembersInvitedByIdOrg()
     *
     * 
     */
    @Test
    public void getOrganizationsMembersInvitedByIdOrgTest() {
        String idOrg = null;
        String key = null;
        String token = null;
        String fields = null;
        // Void response = api.getOrganizationsMembersInvitedByIdOrg(idOrg, key, token, fields);

        // TODO: test validations
    }

    /**
     * getOrganizationsMembersInvitedByIdOrgByField()
     *
     * 
     */
    @Test
    public void getOrganizationsMembersInvitedByIdOrgByFieldTest() {
        String idOrg = null;
        String field = null;
        String key = null;
        String token = null;
        // Void response = api.getOrganizationsMembersInvitedByIdOrgByField(idOrg, field, key, token);

        // TODO: test validations
    }

    /**
     * getOrganizationsMembershipsByIdOrg()
     *
     * 
     */
    @Test
    public void getOrganizationsMembershipsByIdOrgTest() {
        String idOrg = null;
        String key = null;
        String token = null;
        String filter = null;
        String member = null;
        String memberFields = null;
        // Void response = api.getOrganizationsMembershipsByIdOrg(idOrg, key, token, filter, member, memberFields);

        // TODO: test validations
    }

    /**
     * getOrganizationsMembershipsByIdOrgByIdMembership()
     *
     * 
     */
    @Test
    public void getOrganizationsMembershipsByIdOrgByIdMembershipTest() {
        String idOrg = null;
        String idMembership = null;
        String key = null;
        String token = null;
        String member = null;
        String memberFields = null;
        // Void response = api.getOrganizationsMembershipsByIdOrgByIdMembership(idOrg, idMembership, key, token, member, memberFields);

        // TODO: test validations
    }

    /**
     * updateOrganizationsByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsByIdOrgTest() {
        Organizations body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * updateOrganizationsDescByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsDescByIdOrgTest() {
        OrganizationsDesc body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsDescByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * updateOrganizationsDisplayNameByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsDisplayNameByIdOrgTest() {
        OrganizationsDisplayName body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsDisplayNameByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * updateOrganizationsMembersByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsMembersByIdOrgTest() {
        OrganizationsMembers body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsMembersByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * updateOrganizationsMembersByIdOrgByIdMember()
     *
     * 
     */
    @Test
    public void updateOrganizationsMembersByIdOrgByIdMemberTest() {
        OrganizationsMembers body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        String idMember = null;
        // Void response = api.updateOrganizationsMembersByIdOrgByIdMember(body, key, token, idOrg, idMember);

        // TODO: test validations
    }

    /**
     * updateOrganizationsMembersDeactivatedByIdOrgByIdMember()
     *
     * 
     */
    @Test
    public void updateOrganizationsMembersDeactivatedByIdOrgByIdMemberTest() {
        OrganizationsMembersDeactivated body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        String idMember = null;
        // Void response = api.updateOrganizationsMembersDeactivatedByIdOrgByIdMember(body, key, token, idOrg, idMember);

        // TODO: test validations
    }

    /**
     * updateOrganizationsMembershipsByIdOrgByIdMembership()
     *
     * 
     */
    @Test
    public void updateOrganizationsMembershipsByIdOrgByIdMembershipTest() {
        OrganizationsMemberships body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        String idMembership = null;
        // Void response = api.updateOrganizationsMembershipsByIdOrgByIdMembership(body, key, token, idOrg, idMembership);

        // TODO: test validations
    }

    /**
     * updateOrganizationsNameByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsNameByIdOrgTest() {
        OrganizationsName body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsNameByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * updateOrganizationsPrefsAssociatedDomainByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsPrefsAssociatedDomainByIdOrgTest() {
        PrefsAssociatedDomain body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsPrefsAssociatedDomainByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * updateOrganizationsPrefsBoardVisibilityRestrictOrgByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsPrefsBoardVisibilityRestrictOrgByIdOrgTest() {
        PrefsBoardVisibilityRestrict body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsPrefsBoardVisibilityRestrictOrgByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * updateOrganizationsPrefsBoardVisibilityRestrictPrivateByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsPrefsBoardVisibilityRestrictPrivateByIdOrgTest() {
        PrefsBoardVisibilityRestrict body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsPrefsBoardVisibilityRestrictPrivateByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * updateOrganizationsPrefsBoardVisibilityRestrictPublicByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsPrefsBoardVisibilityRestrictPublicByIdOrgTest() {
        PrefsBoardVisibilityRestrict body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsPrefsBoardVisibilityRestrictPublicByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * updateOrganizationsPrefsExternalMembersDisabledByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsPrefsExternalMembersDisabledByIdOrgTest() {
        PrefsExternalMembersDisabled body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsPrefsExternalMembersDisabledByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * updateOrganizationsPrefsGoogleAppsVersionByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsPrefsGoogleAppsVersionByIdOrgTest() {
        PrefsGoogleAppsVersion body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsPrefsGoogleAppsVersionByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * updateOrganizationsPrefsOrgInviteRestrictByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsPrefsOrgInviteRestrictByIdOrgTest() {
        PrefsOrgInviteRestrict body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsPrefsOrgInviteRestrictByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * updateOrganizationsPrefsPermissionLevelByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsPrefsPermissionLevelByIdOrgTest() {
        PrefsPermissionLevel body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsPrefsPermissionLevelByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }

    /**
     * updateOrganizationsWebsiteByIdOrg()
     *
     * 
     */
    @Test
    public void updateOrganizationsWebsiteByIdOrgTest() {
        OrganizationsWebsite body = null;
        String key = null;
        String token = null;
        String idOrg = null;
        // Void response = api.updateOrganizationsWebsiteByIdOrg(body, key, token, idOrg);

        // TODO: test validations
    }
}
