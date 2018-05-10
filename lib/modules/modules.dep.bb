6lowpan.ko rtnl_link_lowpan
6lowpan_iphc

6lowpan_iphc.ko symbol:lowpan_header_compress symbol:lowpan_process_data

8723bs.ko sdio:c*v024CdB723*
cfg80211

af_802154.ko net_pf_36

ak09911.ko acpi*:AK009911:* i2c:ak09911

ak8975.ko acpi*:INVN6500:* acpi*:AK8963:* acpi*:AK8975:* i2c:ak8963 i2c:ak8975 of:N*T*Cak8975* of:N*T*Casahi_kasei,ak8975*

atmel_mxt_ts.ko of:N*T*Catmel,maxtouch* i2c:i2c_ATML1000 i2c:ATML1000:00 i2c:ATML1000 i2c:mXT224 i2c:atmel_mxt_tp i2c:atmel_mxt_ts i2c:qt602240_ts acpi*:ATML1000:*

atomisp-css2400b0_v21.ko pci:v00008086d00000F38sv*sd*bc*sc*i* pci:v00008086d0000117Asv*sd*bc*sc*i* pci:v00008086d00001179sv*sd*bc*sc*i* pci:v00008086d00001178sv*sd*bc*sc*i*
videobuf_vmalloc videobuf_core

atomisp-css2401a0_v21.ko pci:v00008086d000022B8sv*sd*bc*sc*i* pci:v00008086d00001478sv*sd*bc*sc*i*
videobuf_vmalloc videobuf_core

bcma.ko pci:v000014E4d00004727sv*sd*bc*sc*i* pci:v000014E4d00004365sv*sd*bc*sc*i* pci:v000014E4d00004359sv*sd*bc*sc*i* pci:v000014E4d00004358sv*sd*bc*sc*i* pci:v000014E4d00004357sv*sd*bc*sc*i* pci:v000014E4d00004353sv*sd*bc*sc*i* pci:v000014E4d00004331sv*sd*bc*sc*i* pci:v000014E4d0000A8D8sv*sd*bc*sc*i* pci:v000014E4d00004313sv*sd*bc*sc*i* pci:v000014E4d00000576sv*sd*bc*sc*i* symbol:bcma_driver_unregister symbol:__bcma_driver_register symbol:bcma_find_core_unit symbol:bcma_core_dma_translation symbol:bcma_core_pll_ctl symbol:bcma_core_set_clockmode symbol:bcma_core_enable symbol:bcma_core_disable symbol:bcma_core_is_enabled symbol:bcma_chipco_gpio_control symbol:bcma_chipco_gpio_outen symbol:bcma_chipco_gpio_out symbol:bcma_chipco_get_alp_clock symbol:bcma_pmu_spuravoid_pllupdate symbol:bcma_pmu_get_bus_clock symbol:bcma_chipco_regctl_maskset symbol:bcma_chipco_chipctl_maskset symbol:bcma_chipco_pll_maskset symbol:bcma_chipco_pll_write symbol:bcma_chipco_pll_read symbol:bcma_core_pci_down symbol:bcma_core_pci_up symbol:bcma_core_pci_irq_ctl symbol:bcma_core_pci_power_save

brcmfmac.ko usb:v0A5Cp0BDCd*dc*dsc*dp*ic*isc*ip*in* usb:v0A5CpBD1Fd*dc*dsc*dp*ic*isc*ip*in* usb:v0A5CpBD17d*dc*dsc*dp*ic*isc*ip*in* usb:v0A5CpBD1Ed*dc*dsc*dp*ic*isc*ip*in* sdio:c*v02D0d4335* sdio:c*v02D0dA962* sdio:c*v02D0d4334* sdio:c*v02D0d4330* sdio:c*v02D0d4329* sdio:c*v02D0d4324* sdio:c*v02D0dA887*
brcmutil cfg80211

brcmsmac.ko bcma:m04BFid0812rev18cl* bcma:m04BFid0812rev17cl* bcma:m04BFid0812rev11cl*
brcmutil bcma cordic mac80211 cfg80211

brcmutil.ko symbol:brcmu_pktq_mdeq symbol:brcmu_pktq_mlen symbol:brcmu_pktq_peek_tail symbol:brcmu_pktq_init symbol:brcmu_pktq_flush symbol:brcmu_pktq_pflush symbol:brcmu_pktq_pdeq_tail symbol:brcmu_pktq_pdeq_match symbol:brcmu_pktq_pdeq symbol:brcmu_pktq_penq_head symbol:brcmu_pktq_penq symbol:brcmu_pkt_buf_free_skb symbol:brcmu_pkt_buf_get_skb symbol:brcmu_d11_attach

bt_lpm.ko acpi*:OBDA8723:* acpi*:BCM2E3A:* acpi*:BCM2E1A:*

cfg80211.ko net_pf_16_proto_16_family_nl80211 symbol:cfg80211_unregister_wdev symbol:wiphy_rfkill_set_hw_state symbol:wiphy_free symbol:wiphy_unregister symbol:wiphy_rfkill_stop_polling symbol:wiphy_rfkill_start_polling symbol:wiphy_register symbol:wiphy_new symbol:ieee80211_radiotap_iterator_next symbol:ieee80211_radiotap_iterator_init symbol:bridge_tunnel_header symbol:rfc1042_header symbol:ieee80211_get_num_supported_channels symbol:ieee80211_operating_class_to_band symbol:cfg80211_get_p2p_attr symbol:cfg80211_calculate_bitrate symbol:ieee80211_bss_get_ie symbol:cfg80211_classify8021d symbol:ieee80211_amsdu_to_8023s symbol:ieee80211_data_from_8023 symbol:ieee80211_data_to_8023 symbol:ieee80211_get_mesh_hdrlen symbol:ieee80211_get_hdrlen_from_skb symbol:ieee80211_hdrlen symbol:__ieee80211_get_channel symbol:ieee80211_frequency_to_channel symbol:ieee80211_channel_to_frequency symbol:ieee80211_mandatory_rates symbol:ieee80211_get_response_rate symbol:regulatory_hint symbol:wiphy_apply_custom_regulatory symbol:reg_initiator_name symbol:freq_reg_info symbol:cfg80211_unlink_bss symbol:cfg80211_put_bss symbol:cfg80211_ref_bss symbol:cfg80211_inform_bss_width_frame symbol:cfg80211_inform_bss_width symbol:cfg80211_get_bss symbol:cfg80211_find_vendor_ie symbol:cfg80211_find_ie symbol:cfg80211_sched_scan_stopped symbol:cfg80211_sched_scan_stopped_rtnl symbol:cfg80211_sched_scan_results symbol:cfg80211_scan_done symbol:cfg80211_crit_proto_stopped symbol:cfg80211_ft_event symbol:cfg80211_tdls_oper_request symbol:cfg80211_report_wowlan_wakeup symbol:cfg80211_report_obss_beacon symbol:cfg80211_probe_status symbol:cfg80211_cqm_pktloss_notify symbol:cfg80211_cqm_txe_notify symbol:cfg80211_ch_switch_notify symbol:cfg80211_pmksa_candidate_notify symbol:cfg80211_gtk_rekey_notify symbol:cfg80211_cqm_rssi_notify symbol:cfg80211_mgmt_tx_status symbol:cfg80211_rx_unexpected_4addr_frame symbol:cfg80211_rx_spurious_frame symbol:cfg80211_conn_failed symbol:cfg80211_del_sta symbol:cfg80211_new_sta symbol:cfg80211_remain_on_channel_expired symbol:cfg80211_ready_on_channel symbol:cfg80211_notify_new_peer_candidate symbol:cfg80211_rx_unprot_mlme_mgmt symbol:cfg80211_vendor_cmd_reply symbol:__cfg80211_alloc_reply_skb symbol:__cfg80211_send_event_skb symbol:__cfg80211_alloc_event_skb symbol:cfg80211_check_station_change symbol:cfg80211_cac_event symbol:cfg80211_radar_event symbol:cfg80211_rx_mgmt symbol:cfg80211_michael_mic_failure symbol:cfg80211_tx_mlme_mgmt symbol:cfg80211_assoc_timeout symbol:cfg80211_auth_timeout symbol:cfg80211_rx_mlme_mgmt symbol:cfg80211_rx_assoc_resp symbol:cfg80211_ibss_joined symbol:cfg80211_disconnected symbol:cfg80211_roamed_bss symbol:cfg80211_roamed symbol:cfg80211_connect_result symbol:cfg80211_reg_can_beacon symbol:cfg80211_chandef_usable symbol:cfg80211_chandef_dfs_required symbol:cfg80211_chandef_compatible symbol:cfg80211_chandef_valid symbol:cfg80211_chandef_create

cordic.ko symbol:cordic_calc_iq

eeprom_93cx6.ko symbol:eeprom_93cx6_write symbol:eeprom_93cx6_wren symbol:eeprom_93cx6_multiread symbol:eeprom_93cx6_read

gc2235.ko i2c:gc2235 acpi*:INT33F8:*

generic_bl.ko symbol:genericbl_limit_intensity

heci-ish.ko pci:v00008086d000022D8sv*sd*bc*sc*i* symbol:g_ish_print_log
heci

heci.ko symbol:heci_stop symbol:heci_reset symbol:heci_start symbol:heci_device_init symbol:heci_dev_state_str symbol:send_resume symbol:send_suspend symbol:recv_fixed_cl_msg symbol:recv_hbm symbol:heci_hbm_dispatch symbol:heci_hbm_cl_connect_req symbol:heci_hbm_cl_flow_control_req symbol:heci_hbm_start_req symbol:recv_heci_cl_msg symbol:heci_cl_send_msg symbol:heci_cl_read_complete symbol:heci_cl_send symbol:heci_cl_read_start symbol:heci_cl_connect symbol:heci_cl_disconnect symbol:heci_cl_unlink symbol:heci_cl_link symbol:heci_cl_find_read_rb symbol:heci_cl_free symbol:heci_cl_allocate symbol:heci_cl_flush_queues symbol:heci_io_rb_recycle symbol:heci_io_rb_free symbol:heci_deregister symbol:heci_register symbol:heci_cl_disable_device symbol:heci_cl_enable_device symbol:heci_cl_set_drvdata symbol:heci_cl_get_drvdata symbol:heci_register_event_cb symbol:heci_cl_driver_unregister symbol:__heci_cl_driver_register symbol:heci_bus_remove_all_clients symbol:heci_bus_remove_device symbol:heci_bus_add_device symbol:heci_me_cl_by_uuid

hid-heci-ish.ko symbol:register_flush_cb
heci heci_ish

hid-sensor-accel-3d.ko platform:HID_SENSOR_200073
hid_sensor_hub hid_sensor_trigger hid_sensor_iio_common

hid-sensor-als.ko platform:HID_SENSOR_200041
hid_sensor_hub hid_sensor_trigger hid_sensor_iio_common

hid-sensor-gyro-3d.ko platform:HID_SENSOR_200076
hid_sensor_hub hid_sensor_trigger hid_sensor_iio_common

hid-sensor-hub.ko hid:b*g0003v*p* hid:b*g0003v00000483p00009100 hid:b*g0003v00000483p000091D1 hid:b*g0003v00008087p000009FA hid:b*g0003v00008086p000009FA symbol:sensor_hub_device_close symbol:sensor_hub_device_open symbol:sensor_hub_input_get_attribute_info symbol:hid_sensor_get_usage_index symbol:sensor_hub_input_attr_get_raw_value symbol:sensor_hub_get_feature symbol:sensor_hub_set_feature symbol:sensor_hub_remove_callback symbol:sensor_hub_register_callback
sens_col_core

hid-sensor-iio-common.ko symbol:hid_sensor_parse_common_attributes symbol:hid_sensor_write_raw_hyst_value symbol:hid_sensor_read_raw_hyst_value symbol:hid_sensor_write_samp_freq_value symbol:hid_sensor_read_samp_freq_value
hid_sensor_hub

hid-sensor-incl-3d.ko platform:HID_SENSOR_200086
hid_sensor_hub hid_sensor_trigger hid_sensor_iio_common

hid-sensor-magn-3d.ko platform:HID_SENSOR_200083
hid_sensor_hub hid_sensor_trigger hid_sensor_iio_common

hid-sensor-trigger.ko symbol:hid_sensor_setup_trigger symbol:hid_sensor_remove_trigger
hid_sensor_hub

ieee802154.ko symbol:ieee802154_nl_start_confirm symbol:ieee802154_nl_scan_confirm symbol:ieee802154_nl_beacon_indic symbol:ieee802154_nl_disassoc_confirm symbol:ieee802154_nl_disassoc_indic symbol:ieee802154_nl_assoc_confirm symbol:ieee802154_nl_assoc_indic symbol:wpan_phy_free symbol:wpan_phy_unregister symbol:wpan_phy_register symbol:wpan_phy_alloc symbol:wpan_phy_for_each symbol:wpan_phy_find

imx1x5.ko i2c:imx219 i2c:imx208 i2c:imx132 i2c:imx134 i2c:imx135fuji i2c:imx135 i2c:imx175
libmsrlisthelper

ip6table_raw.ko

iptable_raw.ko

kxcjk-1013.ko acpi*:KXTJ1009:* acpi*:KXCJ1008:* acpi*:KXCJ1013:* i2c:kxtj21009 i2c:kxcj91008 i2c:kxcjk1013

lcd.ko symbol:devm_lcd_device_unregister symbol:devm_lcd_device_register symbol:lcd_device_unregister symbol:lcd_device_register

libmsrlisthelper.ko symbol:release_msr_list symbol:load_msr_list symbol:apply_msr_data

lm3554.ko i2c:lm3554 acpi*:INTCF1C:*

lm3642.ko i2c:lm3642 acpi*:INTCF1D:*

lnp_ldisc.ko acpi*:INTL1216:* acpi*:INT33E1:* symbol:register_fmdrv_to_ld_driv symbol:unregister_fmdrv_from_ld_driv

mac80211.ko symbol:ieee80211_free_hw symbol:ieee80211_unregister_hw symbol:ieee80211_register_hw symbol:ieee80211_alloc_hw symbol:ieee80211_restart_hw symbol:ieee80211_free_txskb symbol:ieee80211_report_low_ack symbol:ieee80211_tx_status symbol:ieee80211_tx_status_irqsafe symbol:ieee80211_sta_set_buffered symbol:ieee80211_sta_eosp symbol:ieee80211_sta_block_awake symbol:ieee80211_find_sta symbol:ieee80211_find_sta_by_ifaddr symbol:ieee80211_sched_scan_stopped symbol:ieee80211_sched_scan_results symbol:ieee80211_scan_completed symbol:ieee80211_remain_on_channel_expired symbol:ieee80211_ready_on_channel symbol:ieee80211_request_smps symbol:ieee80211_stop_tx_ba_cb_irqsafe symbol:ieee80211_stop_tx_ba_session symbol:ieee80211_start_tx_ba_cb_irqsafe symbol:ieee80211_start_tx_ba_session symbol:ieee80211_send_bar symbol:ieee80211_stop_rx_ba_session symbol:rate_control_set_rates symbol:ieee80211_get_tx_rates symbol:rate_control_send_low symbol:ieee80211_rate_control_unregister symbol:ieee80211_rate_control_register symbol:ieee80211_get_tkip_p2k symbol:ieee80211_get_tkip_rx_p1k symbol:ieee80211_get_tkip_p1k_iv symbol:ieee80211_aes_cmac_calculate_k1_k2 symbol:ieee80211_rx_irqsafe symbol:ieee80211_rx symbol:ieee80211_sta_ps_transition symbol:ieee80211_get_buffered_bc symbol:ieee80211_ctstoself_get symbol:ieee80211_rts_get symbol:ieee80211_probereq_get symbol:ieee80211_nullfunc_get symbol:ieee80211_pspoll_get symbol:ieee80211_proberesp_get symbol:ieee80211_beacon_get_tim symbol:ieee80211_csa_is_complete symbol:ieee80211_csa_finish symbol:ieee80211_tx_prepare_skb symbol:ieee80211_gtk_rekey_add symbol:ieee80211_remove_key symbol:ieee80211_set_key_rx_seq symbol:ieee80211_set_key_tx_seq symbol:ieee80211_get_key_rx_seq symbol:ieee80211_get_key_tx_seq symbol:ieee80211_gtk_rekey_notify symbol:ieee80211_iter_keys symbol:ieee80211_parse_p2p_noa symbol:ieee80211_update_p2p_noa symbol:ieee80211_radar_detected symbol:ieee80211_ave_rssi symbol:ieee80211_disable_rssi_reports symbol:ieee80211_enable_rssi_reports symbol:ieee80211_resume_disconnect symbol:ieee80211_queue_delayed_work symbol:ieee80211_queue_work symbol:wdev_to_ieee80211_vif symbol:ieee80211_iterate_active_interfaces_rtnl symbol:ieee80211_iterate_active_interfaces_atomic symbol:ieee80211_iterate_active_interfaces symbol:ieee80211_wake_queues symbol:ieee80211_queue_stopped symbol:ieee80211_stop_queues symbol:ieee80211_stop_queue symbol:ieee80211_wake_queue symbol:ieee80211_ctstoself_duration symbol:ieee80211_rts_duration symbol:ieee80211_generic_frame_duration symbol:wiphy_to_ieee80211_hw symbol:ieee80211_iter_chan_contexts_atomic symbol:ieee80211_cqm_rssi_notify symbol:ieee80211_connection_loss symbol:ieee80211_beacon_loss symbol:ieee80211_ap_probereq_get symbol:ieee80211_chswitch_done symbol:__ieee80211_create_tpt_led_trigger symbol:__ieee80211_get_rx_led_name symbol:__ieee80211_get_tx_led_name symbol:__ieee80211_get_assoc_led_name symbol:__ieee80211_get_radio_led_name symbol:ieee80211_report_wowlan_wakeup
cfg80211

ov2680.ko i2c:ov2680f i2c:ov2680b acpi*:OVTI2680:*

ov2722.ko i2c:ov2722 acpi*:INT33FB:*

ov5693.ko i2c:ov5693 acpi*:INT33BE:*

ov680.ko acpi*:OVTI0680:* i2c:ov680

platform_lcd.ko platform:platform_lcd
lcd

rfkill-gpio.ko acpi*:INT33A2:* acpi*:BCM47521:* acpi*:BCM4752E:* acpi*:LNV4752:* acpi*:BCM4752:*

rtl8180.ko pci:v00001432d00007106sv*sd*bc*sc*i* pci:v00001186d00003301sv*sd*bc*sc*i* pci:v00001186d00003300sv*sd*bc*sc*i* pci:v00001799d00006020sv*sd*bc*sc*i* pci:v00001799d00006001sv*sd*bc*sc*i* pci:v000010ECd00008180sv*sd*bc*sc*i* pci:v00001799d0000701Fsv*sd*bc*sc*i* pci:v00001799d0000700Fsv*sd*bc*sc*i* pci:v000010ECd00008185sv*sd*bc*sc*i*
cfg80211 mac80211 eeprom_93cx6

rtl8187.ko usb:v1737p0073d*dc*dsc*dp*ic*isc*ip*in* usb:v1B75p8187d*dc*dsc*dp*ic*isc*ip*in* usb:v18E8p6232d*dc*dsc*dp*ic*isc*ip*in* usb:v13D1pABE6d*dc*dsc*dp*ic*isc*ip*in* usb:v1371p9401d*dc*dsc*dp*ic*isc*ip*in* usb:v114Bp0150d*dc*dsc*dp*ic*isc*ip*in* usb:v0DF6p0029d*dc*dsc*dp*ic*isc*ip*in* usb:v0DF6p0028d*dc*dsc*dp*ic*isc*ip*in* usb:v0DF6p000Dd*dc*dsc*dp*ic*isc*ip*in* usb:v03F0pCA02d*dc*dsc*dp*ic*isc*ip*in* usb:v0846p4260d*dc*dsc*dp*ic*isc*ip*in* usb:v0846p6A00d*dc*dsc*dp*ic*isc*ip*in* usb:v0846p6100d*dc*dsc*dp*ic*isc*ip*in* usb:v0789p010Cd*dc*dsc*dp*ic*isc*ip*in* usb:v0769p11F2d*dc*dsc*dp*ic*isc*ip*in* usb:v0BDAp8198d*dc*dsc*dp*ic*isc*ip*in* usb:v0BDAp8197d*dc*dsc*dp*ic*isc*ip*in* usb:v0BDAp8189d*dc*dsc*dp*ic*isc*ip*in* usb:v0BDAp8187d*dc*dsc*dp*ic*isc*ip*in* usb:v050Dp705Ed*dc*dsc*dp*ic*isc*ip*in* usb:v0B05p171Dd*dc*dsc*dp*ic*isc*ip*in*
cfg80211 mac80211 eeprom_93cx6

sens-col-core.ko symbol:push_sample symbol:add_sens_property symbol:add_data_field symbol:get_senscol_sensor_by_id symbol:get_senscol_sensor_by_name symbol:add_senscol_sensor symbol:remove_senscol_sensor symbol:init_senscol_sensor symbol:alloc_senscol_sensor symbol:remove_senscol_impl symbol:add_senscol_impl symbol:senscol_get_modifier symbol:senscol_name_to_usage symbol:senscol_usage_to_name symbol:senscol_reset_notify symbol:senscol_send_ready_event
hid_heci_ish heci_ish

videobuf-core.ko symbol:videobuf_mmap_mapper symbol:videobuf_poll_stream symbol:videobuf_read_stream symbol:videobuf_stop symbol:videobuf_read_stop symbol:videobuf_read_start symbol:videobuf_read_one symbol:videobuf_streamoff symbol:videobuf_streamon symbol:videobuf_dqbuf symbol:videobuf_qbuf symbol:videobuf_querybuf symbol:videobuf_reqbufs symbol:videobuf_mmap_setup symbol:__videobuf_mmap_setup symbol:videobuf_mmap_free symbol:videobuf_next_field symbol:videobuf_queue_cancel symbol:videobuf_queue_is_busy symbol:videobuf_queue_core_init symbol:videobuf_queue_to_vaddr symbol:videobuf_iolock symbol:videobuf_waiton symbol:videobuf_alloc_vb

videobuf-vmalloc.ko symbol:videobuf_vmalloc_free symbol:videobuf_to_vmalloc symbol:videobuf_queue_vmalloc_init
videobuf_core

vidt_driver.ko symbol:reg_sl_global_info symbol:reg_vIDT

