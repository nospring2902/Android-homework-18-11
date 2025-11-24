package vn.edu.hust.bai3.data

import vn.edu.hust.bai3.model.AppItem

object AppDataProvider {

    fun getSponsoredApps(): List<AppItem> {
        return listOf(
            AppItem(
                name = "Learn Android",
                imageRes = android.R.drawable.ic_dialog_info,
                genre = "Action • Role Playing • Roguelike • Zombie",
                rating = "4.8",
                size = "624 MB"
            ),
            AppItem(
                name = "Learn Japanese",
                imageRes = android.R.drawable.ic_dialog_email,
                genre = "Role Playing",
                rating = "4.8",
                size = "339 MB"
            ),
            AppItem(
                name = "Photoshop",
                imageRes = android.R.drawable.ic_menu_gallery,
                genre = "Strategy • Tower defense",
                rating = "4.9",
                size = "231 MB"
            ),
            AppItem(
                name = "Play Together",
                imageRes = android.R.drawable.ic_menu_compass,
                genre = "Strategy • Multiplayer",
                rating = "4.6",
                size = "256 MB"
            )
        )
    }

    /**
     * Get sample data for recommended apps section
     */
    fun getRecommendedApps(): List<AppItem> {
        return listOf(
            AppItem(
                name = "Suno - AI Music & Songs",
                imageRes = android.R.drawable.ic_lock_idle_alarm,
                genre = "Music & Audio"
            ),
            AppItem(
                name = "Claude by Anthropic",
                imageRes = android.R.drawable.ic_menu_edit,
                genre = "Productivity"
            ),
            AppItem(
                name = "DramaBox - Short Drama",
                imageRes = android.R.drawable.ic_media_ff,
                genre = "Entertainment"
            ),
            AppItem(
                name = "Pika AI Video",
                imageRes = android.R.drawable.ic_menu_view,
                genre = "Video Players"
            ),
            AppItem(
                name = "Spotify Music",
                imageRes = android.R.drawable.ic_lock_silent_mode_off,
                genre = "Music & Audio"
            ),
            AppItem(
                name = "TikTok",
                imageRes = android.R.drawable.ic_menu_recent_history,
                genre = "Social Media"
            )
        )
    }
}

