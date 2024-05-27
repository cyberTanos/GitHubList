package com.example.githublist.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.githublist.ui.theme.GitHubListTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UsersFragment : Fragment() {

    private val vm: UsersVM by viewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
vm.a()
        return ComposeView(requireContext()).apply {
            setContent {

            }
        }
    }
}

@Composable
fun UserItem() {
    Box(modifier = Modifier.fillMaxWidth().height(80.dp).background(Companion.Blue)) {
        Card(
            modifier = Modifier
                .fillMaxSize()
                .padding(4.dp)
        ) {
            Text(
                modifier = Modifier.padding(8.dp).wrapContentSize().background(Companion.Green),

                text = "login"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserItemPreview() {
    GitHubListTheme {
        UserItem()
    }
}
