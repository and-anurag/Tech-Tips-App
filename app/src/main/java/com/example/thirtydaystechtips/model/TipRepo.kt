package com.example.thirtydaystechtips.model

import com.example.thirtydaystechtips.R

class TipRepo {
    val tips = listOf(
        Tip(
            dayResId = R.string.day_1,
            titleResId = R.string.title_charge_phone_at_night,
            imageResId = R.drawable.tip_charge_phone_at_night,
            descriptionResId = R.string.tip_charge_phone_at_night
        ),
        Tip(
            dayResId = R.string.day_2,
            titleResId = R.string.title_use_two_factor_auth,
            imageResId = R.drawable.tip_use_two_factor_auth,
            descriptionResId = R.string.tip_use_two_factor_auth
        ),
        Tip(
            dayResId = R.string.day_3,
            titleResId = R.string.title_clear_browsing_data,
            imageResId = R.drawable.tip_clear_browsing_data,
            descriptionResId = R.string.tip_clear_browsing_data
        ),
        Tip(
            dayResId = R.string.day_4,
            titleResId = R.string.title_disable_unnecessary_notifications,
            imageResId = R.drawable.tip_disable_unnecessary_notifications,
            descriptionResId = R.string.tip_disable_unnecessary_notifications
        ),
        Tip(
            dayResId = R.string.day_5,
            titleResId = R.string.title_use_strong_passwords,
            imageResId = R.drawable.tip_use_strong_passwords,
            descriptionResId = R.string.tip_use_strong_passwords
        ),
        Tip(
            dayResId = R.string.day_6,
            titleResId = R.string.title_back_up_important_data,
            imageResId = R.drawable.tip_back_up_important_data,
            descriptionResId = R.string.tip_back_up_important_data
        )

    )
}