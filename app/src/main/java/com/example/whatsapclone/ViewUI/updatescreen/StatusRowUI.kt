<<<<<<< HEAD:app/src/main/java/com/example/whatsapclone/ViewUI/updatescreen/StatusRowUI.kt
package com.example.whatsapclone.ViewUI.updatescreen
=======
package com.example.whatsapclone.presentation.updatescreen
>>>>>>> db6384c0b08b5fd4f003931fd5e9c7f01c998b11:app/src/main/java/com/example/whatsapclone/presentation/updatescreen/StatusRowUI.kt

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
//@Preview(showSystemUi = true)
fun StatusRowUI(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.fillMaxWidth()
            .padding(top = 5.dp, start = 5.dp, end = 5.dp, bottom = 5.dp)
            .size(height = 200.dp, width = 150.dp),
        shape = RoundedCornerShape(10.dp),
        //colors = CardDefaults.cardColors(Color.White),
        elevation = CardDefaults.cardElevation(5.dp),
    ) {
        Box(
            modifier = Modifier.height(200.dp)
        ) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                Text(
                    title,
                    style = TextStyle(color = Color.Black, fontSize = 16.sp),
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}