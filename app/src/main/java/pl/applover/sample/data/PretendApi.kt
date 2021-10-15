package pl.applover.sample.data

import kotlinx.coroutines.delay
import pl.applover.sample.domain.AndroidDev
import pl.applover.sample.domain.IosDev

/** This class is not subject to change.
 *  It's meant to represent the API in the final project.
 **/
class PretendApi {
    suspend fun getAndroidDevs(): List<AndroidDev> {
        delay(2000)
        return listOf(
            AndroidDev(
                name = "Randy Hampton",
                photoUrl = "https://i.pravatar.cc/150?u=Hampton",
                salaryCents = 50_000_000,
                favouriteSdkVersion = "Marshmallow"
            ),
            AndroidDev(
                name = "Dusty Fontaine",
                photoUrl = "https://i.pravatar.cc/150?u=Fontaine",
                salaryCents = 7_000_000,
                favouriteSdkVersion = "Marshmallow"
            ),
            AndroidDev(
                name = "Jayme Richelieu",
                photoUrl = "https://i.pravatar.cc/150?u=Richelieu",
                salaryCents = 35_000_000,
                favouriteSdkVersion = "Eclair"
            ),
            AndroidDev(
                name = "Bernie Blakely",
                photoUrl = "https://i.pravatar.cc/150?u=Blakely",
                salaryCents = 12_000_000,
                favouriteSdkVersion = "Nougat"
            ),
            AndroidDev(
                name = "Rorie Akers",
                photoUrl = "https://i.pravatar.cc/150?u=Akers",
                salaryCents = 5_000_000,
                favouriteSdkVersion = "Q"
            ),
        )
    }

    suspend fun getIosDevs(): List<IosDev> {
        delay(2000)
        return listOf(
            IosDev(
                name = "Artie Derrickson",
                photoUrl = "https://i.pravatar.cc/150?u=Derrickson",
                salaryCents = 42_000_000,
                appleDevicesCount = 3
            ),
            IosDev(
                name = "Hadyn Beringer",
                photoUrl = "https://i.pravatar.cc/150?u=Beringer",
                salaryCents = 14_000_000,
                appleDevicesCount = 1
            ),
            IosDev(
                name = "Garnet Victor",
                photoUrl = "https://i.pravatar.cc/150?u=Victor",
                salaryCents = 9_000_000,
                appleDevicesCount = 8
            ),
            IosDev(
                name = "Rene Bureau",
                photoUrl = "https://i.pravatar.cc/150?u=Bureau",
                salaryCents = 22_000_000,
                appleDevicesCount = 12
            ),
            IosDev(
                name = "Codie Pressley",
                photoUrl = "https://i.pravatar.cc/150?u=Pressley",
                salaryCents = 7_000_000,
                appleDevicesCount = 5
            ),
        )
    }
}
