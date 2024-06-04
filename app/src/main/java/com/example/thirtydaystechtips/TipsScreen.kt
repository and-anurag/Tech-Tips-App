package com.example.thirtydaystechtips

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtydaystechtips.model.Tip
import com.example.thirtydaystechtips.ui.theme._30DaysTechTipsTheme



@Composable
fun TipItemList(
    modifier: Modifier = Modifier,
    tips: List<Tip>,
    contentPadding: PaddingValues = PaddingValues(0.dp)
) {
    LazyColumn(
        contentPadding = contentPadding,
    ) {
        itemsIndexed(tips){index, tip ->
            TipItem(tip = tip)
        }
    }
}

@Composable
fun TipItem(
    modifier: Modifier = Modifier,
    tip: Tip
) {
    Box(
        modifier = Modifier.padding(12.dp)
    ) {
        Card(
            modifier = modifier,
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        ) {
            Column(
            ) {
                Text(
                    text = stringResource(id = tip.dayResId),
                    modifier = Modifier.padding(
                        start = 12.dp,
                        top = 12.dp,
                        end = 12.dp,
                        bottom = 6.dp
                    )
                )
                Text(
                    text = stringResource(id = tip.titleResId),
                    modifier = Modifier.padding(
                        start = 12.dp,
                        top = 6.dp,
                        end = 12.dp,
                        bottom = 6.dp
                    )
                )
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .sizeIn(maxHeight = 200.dp)

                ) {
                    Image(
                        painter = painterResource(id = tip.imageResId),
                        contentDescription = null,
                        contentScale = ContentScale.FillWidth
                    )
                }

                Text(
                    text = stringResource(id = tip.descriptionResId) ,
                    modifier = Modifier.padding(12.dp)
                )

            }
        }
    }
}




