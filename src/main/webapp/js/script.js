console.log("Page Loaded");
// Open login modal
function openModal() {
    document.getElementById("loginModal").style.display = "block";
}

// Close modal when clicking outside
window.onclick = function(event) {
    const modal = document.getElementById("loginModal");
    if (event.target === modal) {
        modal.style.display = "none";
    }
};

// Show bottom ad after page load
window.onload = function() {
    setTimeout(() => {
        const ad = document.getElementById("adPopup");
        if (ad) ad.style.display = "block";
    }, 2500); // 2.5 seconds
};
