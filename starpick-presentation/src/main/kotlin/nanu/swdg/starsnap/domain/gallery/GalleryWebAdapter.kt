package nanu.swdg.nanu.swdg.starsnap.domain.gallery

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/gallery")
class GalleryWebAdapter {
    @GetMapping("/get")
    fun getGallery(@RequestParam galleryId: String):String {
        return galleryId
    }
}