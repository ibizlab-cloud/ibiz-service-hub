package cn.ibizlab.central.plugin.odoo.util;

import cn.ibizlab.central.plugin.odoo.dataentity.dto.*;
import net.ibizsys.central.util.IEntityDTO;
import net.ibizsys.model.PSModelEnums.DEMethodDTOType;
import net.ibizsys.model.dataentity.service.IPSDEMethodDTO;

public class OdooEntityDTOUtils {

	public static IEntityDTO createEntityDTO(String strName, IPSDEMethodDTO iPSDEMethodDTO) {
		if(DEMethodDTOType.DEFAULT.value.equals(iPSDEMethodDTO.getType())) {
			switch(iPSDEMethodDTO.getCodeName()) {
       	    case "audit_recordDTO":
				return new AuditRecordDTO();
       	    case "avatar_mixin_dto":
				return new AvatarMixinDTO();
       	    case "bus_event_recordDTO":
				return new BusEventRecordDTO();
       	    case "change_password_own_dto":
				return new ChangePasswordOwnDTO();
       	    case "change_password_user_dto":
				return new ChangePasswordUserDTO();
       	    case "change_password_wizard_dto":
				return new ChangePasswordWizardDTO();
       	    case "change_production_qty_dto":
				return new ChangeProductionQtyDTO();
       	    case "cloud_proxy_departmentDTO":
				return new CloudProxyDepartmentDTO();
       	    case "cloud_proxy_organizationDTO":
				return new CloudProxyOrganizationDTO();
       	    case "cloud_proxy_userDTO":
				return new CloudProxyUserDTO();
       	    
       	    case "discuss_channel_dto":
				return new DiscussChannelDTO();
       	    case "discuss_channel_member_dto":
				return new DiscussChannelMemberDTO();
       	    case "discuss_channel_rtc_session_dto":
				return new DiscussChannelRtcSessionDTO();
       	    case "discuss_gif_favorite_dto":
				return new DiscussGifFavoriteDTO();
       	    case "discuss_voice_metadata_dto":
				return new DiscussVoiceMetadataDTO();
       	    case "fav_favoriteDTO":
				return new FavFavoriteDTO();
       	       case "hr_department_counter_dto":
				return new HrDepartmentCounterDTO();
       	    case "hr_department_dto":
				return new HrDepartmentDTO();
       	    case "hr_employee_counter_dto":
				return new HrEmployeeCounterDTO();
       	    case "hr_employee_dto":
				return new HrEmployeeDTO();
       	    
       	    case "image_mixin_dto":
				return new ImageMixinDTO();
       	    case "ir_actions_server_dto":
				return new IrActionsServerDTO();
       	    case "ir_attachment_dto":
				return new IrAttachmentDTO();
       	    case "ir_config_parameter_dto":
				return new IrConfigParameterDTO();
       	    case "ir_cron_dto":
				return new IrCronDTO();
       	    case "ir_cron_progress_dto":
				return new IrCronProgressDTO();
       	    case "ir_cron_trigger_dto":
				return new IrCronTriggerDTO();
       	    case "ir_default_dto":
				return new IrDefaultDTO();
       	    case "ir_mail_server_dto":
				return new IrMailServerDTO();
       	    case "ir_model_dto":
				return new IrModelDTO();
       	    case "ir_model_access_dto":
				return new IrModelAccessDTO();
       	    case "ir_model_constraint_dto":
				return new IrModelConstraintDTO();
       	    case "ir_model_data_dto":
				return new IrModelDataDTO();
       	    case "ir_model_fields_dto":
				return new IrModelFieldsDTO();
       	    case "ir_model_fields_selection_dto":
				return new IrModelFieldsSelectionDTO();
       	    case "ir_model_inherit_dto":
				return new IrModelInheritDTO();
       	    case "ir_model_relation_dto":
				return new IrModelRelationDTO();
       	    case "ir_module_category_dto":
				return new IrModuleCategoryDTO();
       	    case "ir_module_module_dto":
				return new IrModuleModuleDTO();
       	    case "ir_module_module_dependency_dto":
				return new IrModuleModuleDependencyDTO();
       	    case "ir_module_module_exclusion_dto":
				return new IrModuleModuleExclusionDTO();
       	    case "ir_rule_dto":
				return new IrRuleDTO();
       	    case "ir_sequence_dto":
				return new IrSequenceDTO();
       	    case "mail_activity_dto":
				return new MailActivityDTO();
       	    case "mail_activity_plan_dto":
				return new MailActivityPlanDTO();
       	    case "mail_activity_plan_template_dto":
				return new MailActivityPlanTemplateDTO();
       	    case "mail_activity_schedule_dto":
				return new MailActivityScheduleDTO();
       	    case "mail_activity_todo_create_dto":
				return new MailActivityTodoCreateDTO();
       	    case "mail_activity_type_dto":
				return new MailActivityTypeDTO();
       	    case "mail_activity_type_mail_template_rel_dto":
				return new MailActivityTypeMailTemplateRelDTO();
       	    case "mail_alias_dto":
				return new MailAliasDTO();
       	    case "mail_alias_domain_dto":
				return new MailAliasDomainDTO();
       	    case "mail_alias_mixin_dto":
				return new MailAliasMixinDTO();
       	    case "mail_alias_mixin_optional_dto":
				return new MailAliasMixinOptionalDTO();
       	    case "mail_blacklist_dto":
				return new MailBlacklistDTO();
       	    case "mail_blacklist_remove_dto":
				return new MailBlacklistRemoveDTO();
       	    case "mail_bot_dto":
				return new MailBotDTO();
       	    case "mail_canned_response_dto":
				return new MailCannedResponseDTO();
       	    case "mail_compose_message_dto":
				return new MailComposeMessageDTO();
       	    case "mail_composer_mixin_dto":
				return new MailComposerMixinDTO();
       	    case "mail_followers_dto":
				return new MailFollowersDTO();
       	    case "mail_followers_partner_id_dto":
				return new MailFollowersPartnerIdDTO();
       	    case "mail_gateway_allowed_dto":
				return new MailGatewayAllowedDTO();
       	    case "mail_guest_dto":
				return new MailGuestDTO();
       	    case "mail_ice_server_dto":
				return new MailIceServerDTO();
       	    case "mail_link_preview_dto":
				return new MailLinkPreviewDTO();
       	    case "mail_mail_dto":
				return new MailMailDTO();
       	    case "mail_message_dto":
				return new MailMessageDTO();
       	    case "mail_message_reaction_dto":
				return new MailMessageReactionDTO();
       	    case "mail_message_recipient_dto":
				return new MailMessageRecipientDTO();
       	    case "mail_message_schedule_dto":
				return new MailMessageScheduleDTO();
       	    case "mail_message_subtype_dto":
				return new MailMessageSubtypeDTO();
       	    case "mail_message_translation_dto":
				return new MailMessageTranslationDTO();
       	    case "mail_notification_dto":
				return new MailNotificationDTO();
       	    case "mail_push_dto":
				return new MailPushDTO();
       	    case "mail_push_device_dto":
				return new MailPushDeviceDTO();
       	    case "mail_render_mixin_dto":
				return new MailRenderMixinDTO();
       	    case "mail_resend_message_dto":
				return new MailResendMessageDTO();
       	    case "mail_resend_partner_dto":
				return new MailResendPartnerDTO();
       	    case "mail_scheduled_message_dto":
				return new MailScheduledMessageDTO();
       	    case "mail_template_dto":
				return new MailTemplateDTO();
       	    case "mail_template_preview_dto":
				return new MailTemplatePreviewDTO();
       	    case "mail_template_reset_dto":
				return new MailTemplateResetDTO();
       	    case "mail_thread_blacklist_dto":
				return new MailThreadBlacklistDTO();
       	    case "mail_thread_cc_dto":
				return new MailThreadCcDTO();
       	    case "mail_thread_main_attachment_dto":
				return new MailThreadMainAttachmentDTO();
       	    case "mail_thread_phone_dto":
				return new MailThreadPhoneDTO();
       	    case "mail_tracking_duration_mixin_dto":
				return new MailTrackingDurationMixinDTO();
       	    case "mail_tracking_value_dto":
				return new MailTrackingValueDTO();
       	    case "mail_wizard_invite_dto":
				return new MailWizardInviteDTO();
       	    case "res_bank_dto":
				return new ResBankDTO();
       	    case "res_company_dto":
				return new ResCompanyDTO();
       	    case "res_config_dto":
				return new ResConfigDTO();
       	    case "res_config_settings_dto":
				return new ResConfigSettingsDTO();
       	    case "res_country_dto":
				return new ResCountryDTO();
       	    case "res_country_group_dto":
				return new ResCountryGroupDTO();
       	    case "res_country_state_dto":
				return new ResCountryStateDTO();
       	    case "res_currency_dto":
				return new ResCurrencyDTO();
       	    case "res_currency_rate_dto":
				return new ResCurrencyRateDTO();
       	    case "res_device_dto":
				return new ResDeviceDTO();
       	    case "res_device_log_dto":
				return new ResDeviceLogDTO();
       	    case "res_groups_dto":
				return new ResGroupsDTO();
       	    case "res_groups_implied_rel_dto":
				return new ResGroupsImpliedRelDTO();
       	    case "res_groups_users_rel_dto":
				return new ResGroupsUsersRelDTO();
       	    case "res_lang_dto":
				return new ResLangDTO();
       	    case "res_partner_dto":
				return new ResPartnerDTO();
       	    case "res_partner_autocomplete_sync_dto":
				return new ResPartnerAutocompleteSyncDTO();
       	    case "res_partner_bank_dto":
				return new ResPartnerBankDTO();
       	    case "res_partner_category_dto":
				return new ResPartnerCategoryDTO();
       	    case "res_partner_industry_dto":
				return new ResPartnerIndustryDTO();
       	    case "res_partner_title_dto":
				return new ResPartnerTitleDTO();
       	    case "res_users_dto":
				return new ResUsersDTO();
       	    case "res_users_apikeys_dto":
				return new ResUsersApikeysDTO();
       	    case "res_users_apikeys_description_dto":
				return new ResUsersApikeysDescriptionDTO();
       	    case "res_users_apikeys_show_dto":
				return new ResUsersApikeysShowDTO();
       	    case "res_users_deletion_dto":
				return new ResUsersDeletionDTO();
       	    case "res_users_identitycheck_dto":
				return new ResUsersIdentitycheckDTO();
       	    case "res_users_log_dto":
				return new ResUsersLogDTO();
       	    case "res_users_settings_dto":
				return new ResUsersSettingsDTO();
       	    case "res_users_settings_volumes_dto":
				return new ResUsersSettingsVolumesDTO();
       	    case "resource_calendar_dto":
				return new ResourceCalendarDTO();
       	    case "resource_calendar_attendance_dto":
				return new ResourceCalendarAttendanceDTO();
       	    case "resource_calendar_leaves_dto":
				return new ResourceCalendarLeavesDTO();
       	    case "resource_resource_dto":
				return new ResourceResourceDTO();
       	    case "rule_group_rel_dto":
				return new RuleGroupRelDTO();
      	    case "ir_uniresDTO":
				return new IrUniresDTO();
       	    case "unires_group_relDTO":
				return new UniresGroupRelDTO();
			default:
				return new OdooEntityDTO();
			}
		}
		return new OdooEntityDTO();
	}
}
