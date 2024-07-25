package co.edu.sena.myapp2.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.sena.myapp2.R
import co.edu.sena.myapp2.components.ButtonComponent
import co.edu.sena.myapp2.components.CheckboxComponent
import co.edu.sena.myapp2.components.ClickableLoginTextComponent
import co.edu.sena.myapp2.components.DividerTextComponent
import co.edu.sena.myapp2.components.HeadingTextComponent
import co.edu.sena.myapp2.components.MyTextFieldComponent
import co.edu.sena.myapp2.components.NormalTextComponent
import co.edu.sena.myapp2.components.PasswordTextFieldComponent
import co.edu.sena.myapp2.navigation.PostOfficeAppRouter
import co.edu.sena.myapp2.navigation.Screen

@Composable
fun SingUpScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_acount))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                painterResource = painterResource(id = R.drawable.ic_launcher_foreground)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.ic_launcher_foreground)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.ic_launcher_foreground)
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.ic_launcher_foreground)
            )
            CheckboxComponent(value = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {
                    PostOfficeAppRouter.navigateto(Screen.TermsAndConditionsScreen)
                })

            Spacer(modifier = Modifier.height(80.dp))

            ButtonComponent(value = stringResource(id = R.string.register))

            Spacer(modifier = Modifier.height(80.dp))

            DividerTextComponent()

            ClickableLoginTextComponent(onTextSelected = {

            })
        }
    }
}

@Preview
@Composable
fun Default() {
    SingUpScreen()
}