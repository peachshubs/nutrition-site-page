//faq
let faqs = document.querySelectorAll(".faq");

faqs.forEach((faq) => {
    let questionBox = faq.querySelector(".question-box");
    let icon = faq.querySelector("i");

    questionBox.addEventListener("click", () => {
        let isActive = faq.classList.contains("active");

        // Close all open FAQs
        faqs.forEach((f) => {
            f.classList.remove("active");
            f.querySelector(".answer-box").style.display = "none";
            f.querySelector("i").classList.replace("fa-x", "fa-plus");
        });

        // Open the clicked one
        if (!isActive) {
            faq.classList.add("active");
            faq.querySelector(".answer-box").style.display = "block";
            icon.classList.replace("fa-plus", "fa-x");
        }
    });
});
