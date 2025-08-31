package com.example.whatsapclone.ViewUI.glassui

import android.graphics.RenderEffect
import android.graphics.Shader
import android.widget.FrameLayout
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.whatsapclone.R

@Composable
fun GlassFloatingActionButton(
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(65.dp)
            .clip(CircleShape)
    ) {
        // Glass blur background using RenderEffect
        AndroidView(
            modifier = Modifier
                .matchParentSize()
                .clip(CircleShape),
            factory = { ctx ->
                FrameLayout(ctx).apply {
                    setBackgroundColor(android.graphics.Color.TRANSPARENT)
                    val blur = RenderEffect.createBlurEffect(
                        80f, 80f,
                        Shader.TileMode.CLAMP
                    )
                    setRenderEffect(blur) // ✅ Public API, works from API 31+
                }
            },
            update = { view ->
                val blur = RenderEffect.createBlurEffect(
                    80f, 80f,
                    Shader.TileMode.CLAMP
                )
                view.setRenderEffect(blur)
            }
        )

        // Foreground button content (not blurred)
        FloatingActionButton(
            onClick = onClick,
            containerColor = Color.Transparent,
            contentColor = Color.Black,
            modifier = Modifier.matchParentSize()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.camera),
                contentDescription = "Camera",
                modifier = Modifier.size(30.dp),
                tint = Color.Black
            )
        }
    }
}