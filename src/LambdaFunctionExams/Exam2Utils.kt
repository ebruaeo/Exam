import LambdaFunctionExams.capitalizeWords
import kotlin.random.Random

fun main() {
    var onSuccessLambda = { images: List<String> ->
        println(images)

    }

    var onErrorLambda = { errorMessages: String ->
        println(errorMessages)
    }

    NetworkManager.fetchImages(onSuccessLambda, onErrorLambda)

    val btn1 = Button("Button 1")
    btn1.setOnClickListener { btnName ->
        println("$btnName is clicked")
    }
    btn1.performOnClick()

    val btn2 = Button("Button 2")
    btn2.setOnClickListener { btnName ->
        println("$btnName is clicked")
    }
    btn2.performOnClick()

    Swiper().run {
        setOnSwipeListener({ index: Int, str: String ->
            println("$index $str is shown")
        })

        setOnFirstImageShownListener { image: String ->
            println("The first image $image is shown.")
        }

        setOnLastImageShownListener { index, image ->
            println("The last image  $image is shown")
        }

        showSwiper()
        repeat(5) {
            performRightSwipe()
        }
        repeat(5) {
            performLeftSwipe()
        }
    }
}

object NetworkManager {
    private val errorMessages = listOf(
        "Network Error",
        "404 Not Found",
        "Unauthorized Exception",
        "Network Timeout"
    )

    private val images = listOf(
        "image1.jpg",
        "image2.jpg",
        "image3.jpg",
    )


    fun fetchImages(onSuccess: (List<String>) -> Unit, onError: (String) -> Unit) {
        println("Fetching data...")
        //  Thread.sleep(3000L)
        if (Random.nextBoolean()) {
            onSuccess(images.subList(0, Random.nextInt(images.size)))
        } else {
            onError(errorMessages.random())
        }
    }
}

class Button(private val text: String) {
    private var onClickListener: ((String) -> Unit)? = null

    fun setOnClickListener(onClickListener: (String) -> Unit) {
        this.onClickListener = onClickListener
    }

    fun performOnClick() {
        onClickListener?.invoke(text)
    }

}


class Swiper {
    private val images = listOf(
        "image1.jpg",
        "image2.jpg",
        "image3.jpg",
        "image4.jpg",
        "image5.jpg"

    )
    private var currentImageIndex = 0

    private var onSwipeListener: ((Int, String) -> Unit)? = null

    private var onFirstImageShownListener: ((String) -> Unit)? = null

    private var onLastImageShownListener: ((Int, String) -> Unit)? = null

    fun showSwiper() {
        showFirstImage()
    }

    fun setOnSwipeListener(onSwipeListener: (Int, String) -> Unit) {
        this.onSwipeListener = onSwipeListener
    }

    fun setOnFirstImageShownListener(onFirstImageShownListener: ((String) -> Unit)) {
        this.onFirstImageShownListener = onFirstImageShownListener
    }


    fun setOnLastImageShownListener(onLastImageShownListener: ((Int, String) -> Unit)) {
        this.onLastImageShownListener = onLastImageShownListener
    }


    fun showFirstImage() {
        currentImageIndex = 0
        onFirstImageShownListener?.invoke(images.first())
    }

    fun showLastImage() {
        currentImageIndex = images.lastIndex
        onLastImageShownListener?.invoke(currentImageIndex, images.last())
    }

    fun performRightSwipe() {
        if (isLastImage()) {
            onLastImageShownListener?.invoke(currentImageIndex, images.last())
        } else {
            currentImageIndex++
            onSwipeListener?.invoke(currentImageIndex, images[currentImageIndex])
            if (isLastImage()) {
                onLastImageShownListener?.invoke(currentImageIndex, images.last())
            }
        }
    }

    fun performLeftSwipe() {
        if (isFirstImage()) {
            onFirstImageShownListener?.invoke(images.first())
        } else {
            currentImageIndex--
            onSwipeListener?.invoke(currentImageIndex, images[currentImageIndex])
            if (isFirstImage()) {
                onFirstImageShownListener?.invoke(images.first())
            }
        }
    }

    private fun isFirstImage() = currentImageIndex == 0

    private fun isLastImage() = currentImageIndex == images.lastIndex
}