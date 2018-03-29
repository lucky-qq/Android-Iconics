/*
 * Copyright 2014 Mike Penz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mikepenz.fontawesome_typeface_library;

import android.content.Context;
import android.graphics.Typeface;

import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.iconics.typeface.ITypeface;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class FontAwesome implements ITypeface {
    private static final String TTF_FILE = "fontawesome-font-v5.0.6.0.ttf";
    private static Typeface typeface = null;
    private static HashMap<String, Character> mChars;

    @Override
    public IIcon getIcon(String key) {
        return Icon.valueOf(key);
    }

    @Override
    public HashMap<String, Character> getCharacters() {
        if (mChars == null) {
            HashMap<String, Character> aChars = new HashMap<String, Character>();
            for (Icon v : Icon.values()) {
                aChars.put(v.name(), v.character);
            }
            mChars = aChars;
        }
        return mChars;
    }

    @Override
    public String getMappingPrefix() {
        return "faw";
    }

    @Override
    public String getFontName() {
        return "FontAwesome";
    }

    @Override
    public String getVersion() {
        return "5.0.6.0";
    }

    @Override
    public int getIconCount() {
        return mChars.size();
    }

    @Override
    public Collection<String> getIcons() {
        Collection<String> icons = new LinkedList<String>();
        for (Icon value : Icon.values()) {
            icons.add(value.name());
        }
        return icons;
    }

    @Override
    public String getAuthor() {
        return "Dave Gandy";
    }

    @Override
    public String getUrl() {
        return "https://fontawesome.com/";
    }

    @Override
    public String getDescription() {
        return "Get vector icons and social logos on your website with Font Awesome, the webs most popular icon set and toolkit.";
    }

    @Override
    public String getLicense() {
        return "SIL OFL 1.1";
    }

    @Override
    public String getLicenseUrl() {
        return "http://scripts.sil.org/OFL";
    }

    @Override
    public Typeface getTypeface(Context context) {
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + TTF_FILE);
            } catch (Exception e) {
                return null;
            }
        }
        return typeface;
    }

    public enum Icon implements IIcon {
        faw_500px('\uf26e'),
		faw_accessible_icon('\uf368'),
		faw_accusoft('\uf369'),
		faw_adn('\uf170'),
		faw_adversal('\uf36a'),
		faw_affiliatetheme('\uf36b'),
		faw_algolia('\uf36c'),
		faw_amazon_pay('\uf42c'),
		faw_amazon('\uf270'),
		faw_amilia('\uf36d'),
		faw_android('\uf17b'),
		faw_angellist('\uf209'),
		faw_angrycreative('\uf36e'),
		faw_angular('\uf420'),
		faw_app_store_ios('\uf370'),
		faw_app_store('\uf36f'),
		faw_apper('\uf371'),
		faw_apple_pay('\uf415'),
		faw_apple('\uf179'),
		faw_asymmetrik('\uf372'),
		faw_audible('\uf373'),
		faw_autoprefixer('\uf41c'),
		faw_avianex('\uf374'),
		faw_aviato('\uf421'),
		faw_aws('\uf375'),
		faw_bandcamp('\uf2d5'),
		faw_behance_square('\uf1b5'),
		faw_behance('\uf1b4'),
		faw_bimobject('\uf378'),
		faw_bitbucket('\uf171'),
		faw_bitcoin('\uf379'),
		faw_bity('\uf37a'),
		faw_black_tie('\uf27e'),
		faw_blackberry('\uf37b'),
		faw_blogger_b('\uf37d'),
		faw_blogger('\uf37c'),
		faw_bluetooth_b('\uf294'),
		faw_bluetooth('\uf293'),
		faw_btc('\uf15a'),
		faw_buromobelexperte('\uf37f'),
		faw_buysellads('\uf20d'),
		faw_cc_amazon_pay('\uf42d'),
		faw_cc_amex('\uf1f3'),
		faw_cc_apple_pay('\uf416'),
		faw_cc_diners_club('\uf24c'),
		faw_cc_discover('\uf1f2'),
		faw_cc_jcb('\uf24b'),
		faw_cc_mastercard('\uf1f1'),
		faw_cc_paypal('\uf1f4'),
		faw_cc_stripe('\uf1f5'),
		faw_cc_visa('\uf1f0'),
		faw_centercode('\uf380'),
		faw_chrome('\uf268'),
		faw_cloudscale('\uf383'),
		faw_cloudsmith('\uf384'),
		faw_cloudversify('\uf385'),
		faw_codepen('\uf1cb'),
		faw_codiepie('\uf284'),
		faw_connectdevelop('\uf20e'),
		faw_contao('\uf26d'),
		faw_cpanel('\uf388'),
		faw_creative_commons('\uf25e'),
		faw_css3_alt('\uf38b'),
		faw_css3('\uf13c'),
		faw_cuttlefish('\uf38c'),
		faw_d_and_d('\uf38d'),
		faw_dashcube('\uf210'),
		faw_delicious('\uf1a5'),
		faw_deploydog('\uf38e'),
		faw_deskpro('\uf38f'),
		faw_deviantart('\uf1bd'),
		faw_digg('\uf1a6'),
		faw_digital_ocean('\uf391'),
		faw_discord('\uf392'),
		faw_discourse('\uf393'),
		faw_dochub('\uf394'),
		faw_docker('\uf395'),
		faw_draft2digital('\uf396'),
		faw_dribbble_square('\uf397'),
		faw_dribbble('\uf17d'),
		faw_dropbox('\uf16b'),
		faw_drupal('\uf1a9'),
		faw_dyalog('\uf399'),
		faw_earlybirds('\uf39a'),
		faw_edge('\uf282'),
		faw_elementor('\uf430'),
		faw_ember('\uf423'),
		faw_empire('\uf1d1'),
		faw_envira('\uf299'),
		faw_erlang('\uf39d'),
		faw_ethereum('\uf42e'),
		faw_etsy('\uf2d7'),
		faw_expeditedssl('\uf23e'),
		faw_facebook_f('\uf39e'),
		faw_facebook_messenger('\uf39f'),
		faw_facebook_square('\uf082'),
		faw_facebook('\uf09a'),
		faw_firefox('\uf269'),
		faw_first_order('\uf2b0'),
		faw_firstdraft('\uf3a1'),
		faw_flickr('\uf16e'),
		faw_flipboard('\uf44d'),
		faw_fly('\uf417'),
		faw_font_awesome_alt('\uf35c'),
		faw_font_awesome_flag('\uf425'),
		faw_font_awesome('\uf2b4'),
		faw_fonticons_fi('\uf3a2'),
		faw_fonticons('\uf280'),
		faw_fort_awesome_alt('\uf3a3'),
		faw_fort_awesome('\uf286'),
		faw_forumbee('\uf211'),
		faw_foursquare('\uf180'),
		faw_free_code_camp('\uf2c5'),
		faw_freebsd('\uf3a4'),
		faw_get_pocket('\uf265'),
		faw_gg_circle('\uf261'),
		faw_gg('\uf260'),
		faw_git_square('\uf1d2'),
		faw_git('\uf1d3'),
		faw_github_alt('\uf113'),
		faw_github_square('\uf092'),
		faw_github('\uf09b'),
		faw_gitkraken('\uf3a6'),
		faw_gitlab('\uf296'),
		faw_gitter('\uf426'),
		faw_glide_g('\uf2a6'),
		faw_glide('\uf2a5'),
		faw_gofore('\uf3a7'),
		faw_goodreads_g('\uf3a9'),
		faw_goodreads('\uf3a8'),
		faw_google_drive('\uf3aa'),
		faw_google_play('\uf3ab'),
		faw_google_plus_g('\uf0d5'),
		faw_google_plus_square('\uf0d4'),
		faw_google_plus('\uf2b3'),
		faw_google_wallet('\uf1ee'),
		faw_google('\uf1a0'),
		faw_gratipay('\uf184'),
		faw_grav('\uf2d6'),
		faw_gripfire('\uf3ac'),
		faw_grunt('\uf3ad'),
		faw_gulp('\uf3ae'),
		faw_hacker_news_square('\uf3af'),
		faw_hacker_news('\uf1d4'),
		faw_hips('\uf452'),
		faw_hire_a_helper('\uf3b0'),
		faw_hooli('\uf427'),
		faw_hotjar('\uf3b1'),
		faw_houzz('\uf27c'),
		faw_html5('\uf13b'),
		faw_hubspot('\uf3b2'),
		faw_imdb('\uf2d8'),
		faw_instagram('\uf16d'),
		faw_internet_explorer('\uf26b'),
		faw_ioxhost('\uf208'),
		faw_itunes_note('\uf3b5'),
		faw_itunes('\uf3b4'),
		faw_jenkins('\uf3b6'),
		faw_joget('\uf3b7'),
		faw_joomla('\uf1aa'),
		faw_js_square('\uf3b9'),
		faw_js('\uf3b8'),
		faw_jsfiddle('\uf1cc'),
		faw_keycdn('\uf3ba'),
		faw_kickstarter_k('\uf3bc'),
		faw_kickstarter('\uf3bb'),
		faw_korvue('\uf42f'),
		faw_laravel('\uf3bd'),
		faw_lastfm_square('\uf203'),
		faw_lastfm('\uf202'),
		faw_leanpub('\uf212'),
		faw_less('\uf41d'),
		faw_line('\uf3c0'),
		faw_linkedin_in('\uf0e1'),
		faw_linkedin('\uf08c'),
		faw_linode('\uf2b8'),
		faw_linux('\uf17c'),
		faw_lyft('\uf3c3'),
		faw_magento('\uf3c4'),
		faw_maxcdn('\uf136'),
		faw_medapps('\uf3c6'),
		faw_medium_m('\uf3c7'),
		faw_medium('\uf23a'),
		faw_medrt('\uf3c8'),
		faw_meetup('\uf2e0'),
		faw_microsoft('\uf3ca'),
		faw_mix('\uf3cb'),
		faw_mixcloud('\uf289'),
		faw_mizuni('\uf3cc'),
		faw_modx('\uf285'),
		faw_monero('\uf3d0'),
		faw_napster('\uf3d2'),
		faw_nintendo_switch('\uf418'),
		faw_node_js('\uf3d3'),
		faw_node('\uf419'),
		faw_npm('\uf3d4'),
		faw_ns8('\uf3d5'),
		faw_nutritionix('\uf3d6'),
		faw_odnoklassniki_square('\uf264'),
		faw_odnoklassniki('\uf263'),
		faw_opencart('\uf23d'),
		faw_openid('\uf19b'),
		faw_opera('\uf26a'),
		faw_optin_monster('\uf23c'),
		faw_osi('\uf41a'),
		faw_page4('\uf3d7'),
		faw_pagelines('\uf18c'),
		faw_palfed('\uf3d8'),
		faw_patreon('\uf3d9'),
		faw_paypal('\uf1ed'),
		faw_periscope('\uf3da'),
		faw_phabricator('\uf3db'),
		faw_phoenix_framework('\uf3dc'),
		faw_php('\uf457'),
		faw_pied_piper_alt('\uf1a8'),
		faw_pied_piper_pp('\uf1a7'),
		faw_pied_piper('\uf2ae'),
		faw_pinterest_p('\uf231'),
		faw_pinterest_square('\uf0d3'),
		faw_pinterest('\uf0d2'),
		faw_playstation('\uf3df'),
		faw_product_hunt('\uf288'),
		faw_pushed('\uf3e1'),
		faw_python('\uf3e2'),
		faw_qq('\uf1d6'),
		faw_quinscape('\uf459'),
		faw_quora('\uf2c4'),
		faw_ravelry('\uf2d9'),
		faw_react('\uf41b'),
		faw_rebel('\uf1d0'),
		faw_red_river('\uf3e3'),
		faw_reddit_alien('\uf281'),
		faw_reddit_square('\uf1a2'),
		faw_reddit('\uf1a1'),
		faw_rendact('\uf3e4'),
		faw_renren('\uf18b'),
		faw_replyd('\uf3e6'),
		faw_resolving('\uf3e7'),
		faw_rocketchat('\uf3e8'),
		faw_rockrms('\uf3e9'),
		faw_safari('\uf267'),
		faw_sass('\uf41e'),
		faw_schlix('\uf3ea'),
		faw_scribd('\uf28a'),
		faw_searchengin('\uf3eb'),
		faw_sellcast('\uf2da'),
		faw_sellsy('\uf213'),
		faw_servicestack('\uf3ec'),
		faw_shirtsinbulk('\uf214'),
		faw_simplybuilt('\uf215'),
		faw_sistrix('\uf3ee'),
		faw_skyatlas('\uf216'),
		faw_skype('\uf17e'),
		faw_slack_hash('\uf3ef'),
		faw_slack('\uf198'),
		faw_slideshare('\uf1e7'),
		faw_snapchat_ghost('\uf2ac'),
		faw_snapchat_square('\uf2ad'),
		faw_snapchat('\uf2ab'),
		faw_soundcloud('\uf1be'),
		faw_speakap('\uf3f3'),
		faw_spotify('\uf1bc'),
		faw_stack_exchange('\uf18d'),
		faw_stack_overflow('\uf16c'),
		faw_staylinked('\uf3f5'),
		faw_steam_square('\uf1b7'),
		faw_steam_symbol('\uf3f6'),
		faw_steam('\uf1b6'),
		faw_sticker_mule('\uf3f7'),
		faw_strava('\uf428'),
		faw_stripe_s('\uf42a'),
		faw_stripe('\uf429'),
		faw_studiovinari('\uf3f8'),
		faw_stumbleupon_circle('\uf1a3'),
		faw_stumbleupon('\uf1a4'),
		faw_superpowers('\uf2dd'),
		faw_supple('\uf3f9'),
		faw_telegram_plane('\uf3fe'),
		faw_telegram('\uf2c6'),
		faw_tencent_weibo('\uf1d5'),
		faw_themeisle('\uf2b2'),
		faw_trello('\uf181'),
		faw_tripadvisor('\uf262'),
		faw_tumblr_square('\uf174'),
		faw_tumblr('\uf173'),
		faw_twitch('\uf1e8'),
		faw_twitter_square('\uf081'),
		faw_twitter('\uf099'),
		faw_typo3('\uf42b'),
		faw_uber('\uf402'),
		faw_uikit('\uf403'),
		faw_uniregistry('\uf404'),
		faw_untappd('\uf405'),
		faw_usb('\uf287'),
		faw_ussunnah('\uf407'),
		faw_vaadin('\uf408'),
		faw_viacoin('\uf237'),
		faw_viadeo_square('\uf2aa'),
		faw_viadeo('\uf2a9'),
		faw_viber('\uf409'),
		faw_vimeo_square('\uf194'),
		faw_vimeo_v('\uf27d'),
		faw_vimeo('\uf40a'),
		faw_vine('\uf1ca'),
		faw_vk('\uf189'),
		faw_vnv('\uf40b'),
		faw_vuejs('\uf41f'),
		faw_weibo('\uf18a'),
		faw_weixin('\uf1d7'),
		faw_whatsapp_square('\uf40c'),
		faw_whatsapp('\uf232'),
		faw_whmcs('\uf40d'),
		faw_wikipedia_w('\uf266'),
		faw_windows('\uf17a'),
		faw_wordpress_simple('\uf411'),
		faw_wordpress('\uf19a'),
		faw_wpbeginner('\uf297'),
		faw_wpexplorer('\uf2de'),
		faw_wpforms('\uf298'),
		faw_xbox('\uf412'),
		faw_xing_square('\uf169'),
		faw_xing('\uf168'),
		faw_y_combinator('\uf23b'),
		faw_yahoo('\uf19e'),
		faw_yandex_international('\uf414'),
		faw_yandex('\uf413'),
		faw_yelp('\uf1e9'),
		faw_yoast('\uf2b1'),
		faw_youtube_square('\uf431'),
		faw_youtube('\uf167'),
		faw_address_book('\uf2b9'),
		faw_address_card('\uf2bb'),
		faw_arrow_alt_circle_down('\uf358'),
		faw_arrow_alt_circle_left('\uf359'),
		faw_arrow_alt_circle_right('\uf35a'),
		faw_arrow_alt_circle_up('\uf35b'),
		faw_bell_slash('\uf1f6'),
		faw_bell('\uf0f3'),
		faw_bookmark('\uf02e'),
		faw_building('\uf1ad'),
		faw_calendar_alt('\uf073'),
		faw_calendar_check('\uf274'),
		faw_calendar_minus('\uf272'),
		faw_calendar_plus('\uf271'),
		faw_calendar_times('\uf273'),
		faw_calendar('\uf133'),
		faw_caret_square_down('\uf150'),
		faw_caret_square_left('\uf191'),
		faw_caret_square_right('\uf152'),
		faw_caret_square_up('\uf151'),
		faw_chart_bar('\uf080'),
		faw_check_circle('\uf058'),
		faw_check_square('\uf14a'),
		faw_circle('\uf111'),
		faw_clipboard('\uf328'),
		faw_clock('\uf017'),
		faw_clone('\uf24d'),
		faw_closed_captioning('\uf20a'),
		faw_comment_alt('\uf27a'),
		faw_comment('\uf075'),
		faw_comments('\uf086'),
		faw_compass('\uf14e'),
		faw_copy('\uf0c5'),
		faw_copyright('\uf1f9'),
		faw_credit_card('\uf09d'),
		faw_dot_circle('\uf192'),
		faw_edit('\uf044'),
		faw_envelope_open('\uf2b6'),
		faw_envelope('\uf0e0'),
		faw_eye_slash('\uf070'),
		faw_file_alt('\uf15c'),
		faw_file_archive('\uf1c6'),
		faw_file_audio('\uf1c7'),
		faw_file_code('\uf1c9'),
		faw_file_excel('\uf1c3'),
		faw_file_image('\uf1c5'),
		faw_file_pdf('\uf1c1'),
		faw_file_powerpoint('\uf1c4'),
		faw_file_video('\uf1c8'),
		faw_file_word('\uf1c2'),
		faw_file('\uf15b'),
		faw_flag('\uf024'),
		faw_folder_open('\uf07c'),
		faw_folder('\uf07b'),
		faw_frown('\uf119'),
		faw_futbol('\uf1e3'),
		faw_gem('\uf3a5'),
		faw_hand_lizard('\uf258'),
		faw_hand_paper('\uf256'),
		faw_hand_peace('\uf25b'),
		faw_hand_point_down('\uf0a7'),
		faw_hand_point_left('\uf0a5'),
		faw_hand_point_right('\uf0a4'),
		faw_hand_point_up('\uf0a6'),
		faw_hand_pointer('\uf25a'),
		faw_hand_rock('\uf255'),
		faw_hand_scissors('\uf257'),
		faw_hand_spock('\uf259'),
		faw_handshake('\uf2b5'),
		faw_hdd('\uf0a0'),
		faw_heart('\uf004'),
		faw_hospital('\uf0f8'),
		faw_hourglass('\uf254'),
		faw_id_badge('\uf2c1'),
		faw_id_card('\uf2c2'),
		faw_image('\uf03e'),
		faw_images('\uf302'),
		faw_keyboard('\uf11c'),
		faw_lemon('\uf094'),
		faw_life_ring('\uf1cd'),
		faw_lightbulb('\uf0eb'),
		faw_list_alt('\uf022'),
		faw_map('\uf279'),
		faw_meh('\uf11a'),
		faw_minus_square('\uf146'),
		faw_money_bill_alt('\uf3d1'),
		faw_moon('\uf186'),
		faw_newspaper('\uf1ea'),
		faw_object_group('\uf247'),
		faw_object_ungroup('\uf248'),
		faw_paper_plane('\uf1d8'),
		faw_pause_circle('\uf28b'),
		faw_play_circle('\uf144'),
		faw_plus_square('\uf0fe'),
		faw_question_circle('\uf059'),
		faw_registered('\uf25d'),
		faw_save('\uf0c7'),
		faw_share_square('\uf14d'),
		faw_smile('\uf118'),
		faw_snowflake('\uf2dc'),
		faw_square('\uf0c8'),
		faw_star_half('\uf089'),
		faw_star('\uf005'),
		faw_sticky_note('\uf249'),
		faw_stop_circle('\uf28d'),
		faw_sun('\uf185'),
		faw_thumbs_down('\uf165'),
		faw_thumbs_up('\uf164'),
		faw_times_circle('\uf057'),
		faw_trash_alt('\uf2ed'),
		faw_user_circle('\uf2bd'),
		faw_user('\uf007'),
		faw_window_close('\uf410'),
		faw_window_maximize('\uf2d0'),
		faw_window_minimize('\uf2d1'),
		faw_window_restore('\uf2d2'),
		faw_address_book2('\uf2ba'),
		faw_address_card2('\uf2bc'),
		faw_adjust('\uf042'),
		faw_align_center('\uf037'),
		faw_align_justify('\uf039'),
		faw_align_left('\uf036'),
		faw_align_right('\uf038'),
		faw_ambulance('\uf0f9'),
		faw_american_sign_language_interpreting('\uf2a3'),
		faw_anchor('\uf13d'),
		faw_angle_double_down('\uf103'),
		faw_angle_double_left('\uf100'),
		faw_angle_double_right('\uf101'),
		faw_angle_double_up('\uf102'),
		faw_angle_down('\uf107'),
		faw_angle_left('\uf104'),
		faw_angle_right('\uf105'),
		faw_angle_up('\uf106'),
		faw_archive('\uf187'),
		faw_arrow_alt_circle_down2('\uf35d'),
		faw_arrow_alt_circle_left2('\uf35e'),
		faw_arrow_alt_circle_right2('\uf35f'),
		faw_arrow_alt_circle_up2('\uf360'),
		faw_arrow_circle_down('\uf0ab'),
		faw_arrow_circle_left('\uf0a8'),
		faw_arrow_circle_right('\uf0a9'),
		faw_arrow_circle_up('\uf0aa'),
		faw_arrow_down('\uf063'),
		faw_arrow_left('\uf060'),
		faw_arrow_right('\uf061'),
		faw_arrow_up('\uf062'),
		faw_arrows_alt_h('\uf337'),
		faw_arrows_alt_v('\uf338'),
		faw_arrows_alt('\uf0b2'),
		faw_assistive_listening_systems('\uf2a2'),
		faw_asterisk('\uf069'),
		faw_at('\uf1fa'),
		faw_audio_description('\uf29e'),
		faw_backward('\uf04a'),
		faw_balance_scale('\uf24e'),
		faw_ban('\uf05e'),
		faw_barcode('\uf02a'),
		faw_bars('\uf0c9'),
		faw_baseball_ball('\uf433'),
		faw_basketball_ball('\uf434'),
		faw_bath('\uf2cd'),
		faw_battery_empty('\uf244'),
		faw_battery_full('\uf240'),
		faw_battery_half('\uf242'),
		faw_battery_quarter('\uf243'),
		faw_battery_three_quarters('\uf241'),
		faw_bed('\uf236'),
		faw_beer('\uf0fc'),
		faw_bell_slash2('\uf1f7'),
		faw_bell2('\uf0f4'),
		faw_bicycle('\uf206'),
		faw_binoculars('\uf1e5'),
		faw_birthday_cake('\uf1fd'),
		faw_blind('\uf29d'),
		faw_bold('\uf032'),
		faw_bolt('\uf0e7'),
		faw_bomb('\uf1e2'),
		faw_book('\uf02d'),
		faw_bookmark2('\uf02f'),
		faw_bowling_ball('\uf436'),
		faw_braille('\uf2a1'),
		faw_briefcase('\uf0b1'),
		faw_bug('\uf188'),
		faw_building2('\uf1ae'),
		faw_bullhorn('\uf0a1'),
		faw_bullseye('\uf140'),
		faw_bus('\uf207'),
		faw_calculator('\uf1ec'),
		faw_calendar_alt2('\uf074'),
		faw_calendar_check2('\uf275'),
		faw_calendar_minus2('\uf276'),
		faw_calendar_plus2('\uf277'),
		faw_calendar_times2('\uf278'),
		faw_calendar2('\uf134'),
		faw_camera_retro('\uf083'),
		faw_camera('\uf030'),
		faw_car('\uf1b9'),
		faw_caret_down('\uf0d7'),
		faw_caret_left('\uf0d9'),
		faw_caret_right('\uf0da'),
		faw_caret_square_down2('\uf153'),
		faw_caret_square_left2('\uf193'),
		faw_caret_square_right2('\uf154'),
		faw_caret_square_up2('\uf155'),
		faw_caret_up('\uf0d8'),
		faw_cart_arrow_down('\uf218'),
		faw_cart_plus('\uf217'),
		faw_certificate('\uf0a3'),
		faw_chart_area('\uf1fe'),
		faw_chart_bar2('\uf084'),
		faw_chart_line('\uf201'),
		faw_chart_pie('\uf200'),
		faw_check_circle2('\uf05a'),
		faw_check_square2('\uf14b'),
		faw_check('\uf00c'),
		faw_chess_bishop('\uf43a'),
		faw_chess_board('\uf43c'),
		faw_chess_king('\uf43f'),
		faw_chess_knight('\uf441'),
		faw_chess_pawn('\uf443'),
		faw_chess_queen('\uf445'),
		faw_chess_rook('\uf447'),
		faw_chess('\uf439'),
		faw_chevron_circle_down('\uf13a'),
		faw_chevron_circle_left('\uf137'),
		faw_chevron_circle_right('\uf138'),
		faw_chevron_circle_up('\uf139'),
		faw_chevron_down('\uf078'),
		faw_chevron_left('\uf053'),
		faw_chevron_right('\uf054'),
		faw_chevron_up('\uf077'),
		faw_child('\uf1af'),
		faw_circle_notch('\uf1ce'),
		faw_circle2('\uf112'),
		faw_clipboard2('\uf329'),
		faw_clock2('\uf018'),
		faw_clone2('\uf24f'),
		faw_closed_captioning2('\uf20b'),
		faw_cloud_download_alt('\uf381'),
		faw_cloud_upload_alt('\uf382'),
		faw_cloud('\uf0c2'),
		faw_code_branch('\uf126'),
		faw_code('\uf121'),
		faw_coffee('\uf0f5'),
		faw_cog('\uf013'),
		faw_cogs('\uf085'),
		faw_columns('\uf0db'),
		faw_comment_alt2('\uf27b'),
		faw_comment2('\uf076'),
		faw_comments2('\uf087'),
		faw_compass2('\uf14f'),
		faw_compress('\uf066'),
		faw_copy2('\uf0c6'),
		faw_copyright2('\uf1fb'),
		faw_credit_card2('\uf09e'),
		faw_crop('\uf125'),
		faw_crosshairs('\uf05b'),
		faw_cube('\uf1b2'),
		faw_cubes('\uf1b3'),
		faw_cut('\uf0c4'),
		faw_database('\uf1c0'),
		faw_deaf('\uf2a4'),
		faw_desktop('\uf108'),
		faw_dollar_sign('\uf156'),
		faw_dot_circle2('\uf195'),
		faw_download('\uf019'),
		faw_edit2('\uf045'),
		faw_eject('\uf052'),
		faw_ellipsis_h('\uf141'),
		faw_ellipsis_v('\uf142'),
		faw_envelope_open2('\uf2b7'),
		faw_envelope_square('\uf199'),
		faw_envelope2('\uf0e2'),
		faw_eraser('\uf12d'),
		faw_euro_sign('\uf157'),
		faw_exchange_alt('\uf362'),
		faw_exclamation_circle('\uf06a'),
		faw_exclamation_triangle('\uf071'),
		faw_exclamation('\uf12a'),
		faw_expand_arrows_alt('\uf31e'),
		faw_expand('\uf065'),
		faw_external_link_alt('\uf361'),
		faw_external_link_square_alt('\uf363'),
		faw_eye_dropper('\uf1fc'),
		faw_eye_slash2('\uf072'),
		faw_eye('\uf06e'),
		faw_fast_backward('\uf049'),
		faw_fast_forward('\uf050'),
		faw_fax('\uf1ac'),
		faw_female('\uf182'),
		faw_fighter_jet('\uf0fb'),
		faw_file_alt2('\uf15d'),
		faw_file_archive2('\uf1cf'),
		faw_file_audio2('\uf1d9'),
		faw_file_code2('\uf1da'),
		faw_file_excel2('\uf1db'),
		faw_file_image2('\uf1dc'),
		faw_file_pdf2('\uf1dd'),
		faw_file_powerpoint2('\uf1de'),
		faw_file_video2('\uf1df'),
		faw_file_word2('\uf1e0'),
		faw_file2('\uf15e'),
		faw_film('\uf008'),
		faw_filter('\uf0b0'),
		faw_fire_extinguisher('\uf135'),
		faw_fire('\uf06d'),
		faw_flag_checkered('\uf11e'),
		faw_flag2('\uf025'),
		faw_flask('\uf0c3'),
		faw_folder_open2('\uf07d'),
		faw_folder2('\uf07e'),
		faw_font('\uf031'),
		faw_football_ball('\uf44e'),
		faw_forward('\uf04e'),
		faw_frown2('\uf11b'),
		faw_futbol2('\uf1e4'),
		faw_gamepad('\uf11d'),
		faw_gavel('\uf0e3'),
		faw_gem2('\uf3b3'),
		faw_genderless('\uf22d'),
		faw_gift('\uf06b'),
		faw_glass_martini('\uf000'),
		faw_globe('\uf0ac'),
		faw_golf_ball('\uf450'),
		faw_graduation_cap('\uf19d'),
		faw_h_square('\uf0fd'),
		faw_hand_lizard2('\uf25c'),
		faw_hand_paper2('\uf25f'),
		faw_hand_peace2('\uf26c'),
		faw_hand_point_down2('\uf0ad'),
		faw_hand_point_left2('\uf0ae'),
		faw_hand_point_right2('\uf0af'),
		faw_hand_point_up2('\uf0b3'),
		faw_hand_pointer2('\uf26f'),
		faw_hand_rock2('\uf27f'),
		faw_hand_scissors2('\uf283'),
		faw_hand_spock2('\uf28c'),
		faw_handshake2('\uf2be'),
		faw_hashtag('\uf292'),
		faw_hdd2('\uf0a2'),
		faw_heading('\uf1e1'),
		faw_headphones('\uf026'),
		faw_heart2('\uf006'),
		faw_heartbeat('\uf21e'),
		faw_history('\uf1e6'),
		faw_hockey_puck('\uf453'),
		faw_home('\uf015'),
		faw_hospital2('\uf0fa'),
		faw_hourglass_end('\uf253'),
		faw_hourglass_half('\uf252'),
		faw_hourglass_start('\uf251'),
		faw_hourglass2('\uf28e'),
		faw_i_cursor('\uf246'),
		faw_id_badge2('\uf2c3'),
		faw_id_card2('\uf2c7'),
		faw_image2('\uf03f'),
		faw_images2('\uf303'),
		faw_inbox('\uf01c'),
		faw_indent('\uf03c'),
		faw_industry('\uf28f'),
		faw_info_circle('\uf05c'),
		faw_info('\uf129'),
		faw_italic('\uf033'),
		faw_key('\uf088'),
		faw_keyboard2('\uf11f'),
		faw_language('\uf1ab'),
		faw_laptop('\uf109'),
		faw_leaf('\uf06c'),
		faw_lemon2('\uf095'),
		faw_level_down_alt('\uf3be'),
		faw_level_up_alt('\uf3bf'),
		faw_life_ring2('\uf1eb'),
		faw_lightbulb2('\uf0ec'),
		faw_link('\uf0c1'),
		faw_lira_sign('\uf196'),
		faw_list_alt2('\uf023'),
		faw_list_ol('\uf0cb'),
		faw_list_ul('\uf0ca'),
		faw_list('\uf03a'),
		faw_location_arrow('\uf124'),
		faw_lock_open('\uf3c1'),
		faw_lock('\uf027'),
		faw_long_arrow_alt_down('\uf309'),
		faw_long_arrow_alt_left('\uf30a'),
		faw_long_arrow_alt_right('\uf30b'),
		faw_long_arrow_alt_up('\uf30c'),
		faw_low_vision('\uf2a8'),
		faw_magic('\uf0d0'),
		faw_magnet('\uf079'),
		faw_male('\uf183'),
		faw_map_marker_alt('\uf3c5'),
		faw_map_marker('\uf041'),
		faw_map_pin('\uf290'),
		faw_map_signs('\uf291'),
		faw_map2('\uf295'),
		faw_mars_double('\uf227'),
		faw_mars_stroke_h('\uf22b'),
		faw_mars_stroke_v('\uf22a'),
		faw_mars_stroke('\uf229'),
		faw_mars('\uf222'),
		faw_medkit('\uf0ff'),
		faw_meh2('\uf120'),
		faw_mercury('\uf223'),
		faw_microchip('\uf2db'),
		faw_microphone_slash('\uf131'),
		faw_microphone('\uf130'),
		faw_minus_circle('\uf056'),
		faw_minus_square2('\uf147'),
		faw_minus('\uf068'),
		faw_mobile_alt('\uf3cd'),
		faw_mobile('\uf10b'),
		faw_money_bill_alt2('\uf3dd'),
		faw_moon2('\uf18e'),
		faw_motorcycle('\uf21c'),
		faw_mouse_pointer('\uf245'),
		faw_music('\uf001'),
		faw_neuter('\uf22c'),
		faw_newspaper2('\uf1ef'),
		faw_object_group2('\uf24a'),
		faw_object_ungroup2('\uf250'),
		faw_outdent('\uf03b'),
		faw_paint_brush('\uf1ff'),
		faw_paper_plane2('\uf1f8'),
		faw_paperclip('\uf0cc'),
		faw_paragraph('\uf204'),
		faw_paste('\uf0ea'),
		faw_pause_circle2('\uf29a'),
		faw_pause('\uf04c'),
		faw_paw('\uf1b0'),
		faw_pen_square('\uf14c'),
		faw_pencil_alt('\uf304'),
		faw_percent('\uf29b'),
		faw_phone_square('\uf098'),
		faw_phone_volume('\uf2a0'),
		faw_phone('\uf096'),
		faw_plane('\uf07a'),
		faw_play_circle2('\uf145'),
		faw_play('\uf04b'),
		faw_plug('\uf205'),
		faw_plus_circle('\uf055'),
		faw_plus_square2('\uf10a'),
		faw_plus('\uf067'),
		faw_podcast('\uf2ce'),
		faw_pound_sign('\uf158'),
		faw_power_off('\uf011'),
		faw_print('\uf034'),
		faw_puzzle_piece('\uf12e'),
		faw_qrcode('\uf029'),
		faw_question_circle2('\uf05d'),
		faw_question('\uf128'),
		faw_quidditch('\uf458'),
		faw_quote_left('\uf10d'),
		faw_quote_right('\uf10e'),
		faw_random('\uf07f'),
		faw_recycle('\uf1b8'),
		faw_redo_alt('\uf2f9'),
		faw_redo('\uf01e'),
		faw_registered2('\uf29c'),
		faw_reply_all('\uf122'),
		faw_reply('\uf3e5'),
		faw_retweet('\uf08a'),
		faw_road('\uf01a'),
		faw_rocket('\uf13e'),
		faw_rss_square('\uf143'),
		faw_rss('\uf09f'),
		faw_ruble_sign('\uf159'),
		faw_rupee_sign('\uf15f'),
		faw_save2('\uf0cd'),
		faw_search_minus('\uf010'),
		faw_search_plus('\uf00e'),
		faw_search('\uf002'),
		faw_server('\uf233'),
		faw_share_alt_square('\uf20c'),
		faw_share_alt('\uf20f'),
		faw_share_square2('\uf160'),
		faw_share('\uf064'),
		faw_shekel_sign('\uf219'),
		faw_shield_alt('\uf3ed'),
		faw_ship('\uf21a'),
		faw_shopping_bag('\uf29f'),
		faw_shopping_basket('\uf2a7'),
		faw_shopping_cart('\uf08b'),
		faw_shower('\uf2cc'),
		faw_sign_in_alt('\uf2f6'),
		faw_sign_language('\uf2af'),
		faw_sign_out_alt('\uf2f5'),
		faw_signal('\uf012'),
		faw_sitemap('\uf0e8'),
		faw_sliders_h('\uf21b'),
		faw_smile2('\uf123'),
		faw_snowflake2('\uf2df'),
		faw_sort_alpha_down('\uf161'),
		faw_sort_alpha_up('\uf162'),
		faw_sort_amount_down('\uf163'),
		faw_sort_amount_up('\uf166'),
		faw_sort_down('\uf0dd'),
		faw_sort_numeric_down('\uf16a'),
		faw_sort_numeric_up('\uf16f'),
		faw_sort_up('\uf0de'),
		faw_sort('\uf0dc'),
		faw_space_shuttle('\uf197'),
		faw_spinner('\uf110'),
		faw_square_full('\uf45c'),
		faw_square2('\uf0ce'),
		faw_star_half2('\uf08d'),
		faw_star2('\uf009'),
		faw_step_backward('\uf048'),
		faw_step_forward('\uf051'),
		faw_stethoscope('\uf0f1'),
		faw_sticky_note2('\uf2bf'),
		faw_stop_circle2('\uf2c0'),
		faw_stop('\uf04d'),
		faw_stopwatch('\uf2f2'),
		faw_street_view('\uf21d'),
		faw_strikethrough('\uf0cf'),
		faw_subscript('\uf12c'),
		faw_subway('\uf239'),
		faw_suitcase('\uf0f2'),
		faw_sun2('\uf18f'),
		faw_superscript('\uf12b'),
		faw_sync_alt('\uf2f1'),
		faw_sync('\uf021'),
		faw_table_tennis('\uf45d'),
		faw_table('\uf0d1'),
		faw_tablet_alt('\uf3fa'),
		faw_tablet('\uf10c'),
		faw_tachometer_alt('\uf3fd'),
		faw_tag('\uf02b'),
		faw_tags('\uf02c'),
		faw_tasks('\uf0b4'),
		faw_taxi('\uf1ba'),
		faw_terminal('\uf127'),
		faw_text_height('\uf035'),
		faw_text_width('\uf03d'),
		faw_th_large('\uf00a'),
		faw_th_list('\uf00b'),
		faw_th('\uf00d'),
		faw_thermometer_empty('\uf2cb'),
		faw_thermometer_full('\uf2c8'),
		faw_thermometer_half('\uf2c9'),
		faw_thermometer_quarter('\uf2ca'),
		faw_thermometer_three_quarters('\uf2cf'),
		faw_thumbs_down2('\uf172'),
		faw_thumbs_up2('\uf175'),
		faw_thumbtack('\uf08e'),
		faw_ticket_alt('\uf3ff'),
		faw_times_circle2('\uf05f'),
		faw_times('\uf00f'),
		faw_tint('\uf043'),
		faw_toggle_off('\uf21f'),
		faw_toggle_on('\uf220'),
		faw_trademark('\uf2d3'),
		faw_train('\uf238'),
		faw_transgender_alt('\uf225'),
		faw_transgender('\uf224'),
		faw_trash_alt2('\uf2ee'),
		faw_trash('\uf221'),
		faw_tree('\uf1bb'),
		faw_trophy('\uf091'),
		faw_truck('\uf0d6'),
		faw_tty('\uf226'),
		faw_tv('\uf2d4'),
		faw_umbrella('\uf0e9'),
		faw_underline('\uf0df'),
		faw_undo_alt('\uf2ea'),
		faw_undo('\uf0e4'),
		faw_universal_access('\uf2e1'),
		faw_university('\uf19c'),
		faw_unlink('\uf12f'),
		faw_unlock_alt('\uf13f'),
		faw_unlock('\uf09c'),
		faw_upload('\uf093'),
		faw_user_circle2('\uf2e2'),
		faw_user_md('\uf0f0'),
		faw_user_plus('\uf234'),
		faw_user_secret('\uf228'),
		faw_user_times('\uf235'),
		faw_user2('\uf014'),
		faw_users('\uf0c0'),
		faw_utensil_spoon('\uf2e5'),
		faw_utensils('\uf2e7'),
		faw_venus_double('\uf22e'),
		faw_venus_mars('\uf22f'),
		faw_venus('\uf230'),
		faw_video('\uf040'),
		faw_volleyball_ball('\uf45f'),
		faw_volume_down('\uf028'),
		faw_volume_off('\uf046'),
		faw_volume_up('\uf047'),
		faw_wheelchair('\uf19f'),
		faw_wifi('\uf23f'),
		faw_window_close2('\uf422'),
		faw_window_maximize2('\uf2e3'),
		faw_window_minimize2('\uf2e4'),
		faw_window_restore2('\uf2e6'),
		faw_won_sign('\uf176'),
		faw_wrench('\uf0b5'),
		faw_yen_sign('\uf177');

        char character;

        Icon(char character) {
            this.character = character;
        }

        public String getFormattedName() {
            return "{" + name() + "}";
        }

        public char getCharacter() {
            return character;
        }

        public String getName() {
            return name();
        }

        // remember the typeface so we can use it later
        private static ITypeface typeface;

        public ITypeface getTypeface() {
            if (typeface == null) {
                typeface = new FontAwesome();
            }
            return typeface;
        }
    }
}
