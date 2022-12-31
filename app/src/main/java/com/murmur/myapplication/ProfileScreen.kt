package com.murmur.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileDescription(

) {
    val letterSpacing = 0.5.sp
    val lineHeight = 20.sp
    val profileData = ProfileData.getProfileData()
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {


        Text(
            text = "User Profile",
            fontWeight = FontWeight.Bold,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
                .padding(16.dp)
        )

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                imageVector = ImageVector.vectorResource(id = profileData.avatarUrl),
                contentDescription = "user",
                modifier = Modifier
                    .size(50.dp)
            )
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.Start
        ) {


            Text(
                text = profileData.firstName,
                fontWeight = FontWeight.Bold,
                letterSpacing = letterSpacing,
                lineHeight = lineHeight,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = profileData.lastName,
                letterSpacing = letterSpacing,
                lineHeight = lineHeight,
                modifier = Modifier.padding(16.dp)
            )
            Text(
                text = profileData.gender,
                letterSpacing = letterSpacing,
                lineHeight = lineHeight,
                modifier = Modifier.padding(16.dp)
            )

            Text(
                text = profileData.telephone,
                color = Color(0xFF3D3D91),
                letterSpacing = letterSpacing,
                lineHeight = lineHeight, modifier = Modifier.padding(16.dp)
            )

            Text(
                text = profileData.email,
                color = Color(0xFF3D3D91),
                letterSpacing = letterSpacing,
                lineHeight = lineHeight,
                modifier = Modifier.padding(16.dp)
            )

        }

    }
}


