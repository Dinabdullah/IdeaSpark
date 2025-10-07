package com.example.ideaspark.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val viewModel: HomeViewModel = androidx.lifecycle.viewmodel.compose.viewModel()
    val activities by viewModel.state.collectAsState()
    val categories = listOf(
        "Education",
        "Recreational",
        "Social",
        "Charity",
        "Cooking",
        "Relaxation",
        "Busywork"
    )
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopAppBar(title = { Text("Spark an Idea!") }) }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(categories.size) { index ->
                Button(
                    onClick = {
                        viewModel.fetchActivities(categories[index].lowercase())
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(categories[index])
                }
            }
            items(activities) { activity ->
                Text(text = activity.activity)
            }
        }
        }
    }


