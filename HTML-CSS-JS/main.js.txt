/*=============== SHOW MENU ===============*/

const navMenu = document.getElementById('nav-menu'),
      navToggle = document.getElementById('nav-toggle'),
      navClose = document.getElementById('nav-close')

/* Menu show */
if(navToggle){
    navToggle.addEventListener('click', () =>{
        navMenu.classList.add('show-menu')
    })
}

/* Menu hidden */
if(navClose){
    navClose.addEventListener('click', () =>{
        navMenu.classList.remove('show-menu')
    })
}

/*=============== REMOVE MENU MOBILE ===============*/
const navLink = document.querySelectorAll('.nav__link')

const linkAction = () =>{
    const navMenu = document.getElementById('nav-menu')
    // When we click on each nav__link, we remove the show-menu class
    navMenu.classList.remove('show-menu')
}
navLink.forEach(n => n.addEventListener('click', linkAction))

/*=============== ADD BLUR TO HEADER ===============*/

const blurHeader = () =>{
    const header = document.getElementById('header')
    // Add a class if the bottom offset is greater than 50 of the viewport
    this.scrollY >= 50 ? header.classList.add('blur-header') 
                       : header.classList.remove('blur-header')
}
window.addEventListener('scroll', blurHeader)
/*=============== SHOW SCROLL UP ===============*/ 
const scrollUp = () =>{
	const scrollUp = document.getElementById('scroll-up')
    // When the scroll is higher than 350 viewport height, add the show-scroll class to the a tag with the scrollup class
	this.scrollY >= 350 ? scrollUp.classList.add('show-scroll')
						: scrollUp.classList.remove('show-scroll')
}
window.addEventListener('scroll', scrollUp)

/*=============== FORM VALIDATION ===============*/
const form = document.getElementById('join-form'); // Replace with your form ID
const emailInput = document.getElementById('email-input'); // Replace with your email input ID
const passwordInput = document.getElementById('password-input'); // Replace with your password input ID (if applicable)
const errorMessage = document.getElementById('error-message'); // Replace with your error message container ID

// Email validation function
const validateEmail = (email) => {
    const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    return regex.test(email);
};

// Password validation function (at least 8 characters, 1 number, 1 special character)
const validatePassword = (password) => {
    const regex = /^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,}$/;
    return regex.test(password);
};

// Show error message
const showError = (message) => {
    errorMessage.innerText = message;
    errorMessage.style.display = 'block';
};

// Clear error message
const clearError = () => {
    errorMessage.innerText = '';
    errorMessage.style.display = 'none';
};

// Form validation logic
form.addEventListener('submit', (e) => {
    e.preventDefault(); // Prevent form submission for validation

    clearError(); // Clear previous error messages

    const email = emailInput.value.trim();
    const password = passwordInput ? passwordInput.value.trim() : null;

    if (!email) {
        showError('Email is required.');
        return;
    }

    if (!validateEmail(email)) {
        showError('Please enter a valid email address.');
        return;
    }

    if (passwordInput && !password) {
        showError('Password is required.');
        return;
    }

    if (passwordInput && !validatePassword(password)) {
        showError('Password must be at least 8 characters long, include at least one number and one special character.');
        return;
    }

    // If validation passes
    alert('Form submitted successfully!');
    form.reset(); // Optional: Reset form fields
});


/*=============== SCROLL SECTIONS ACTIVE LINK ===============*/
const sections = document.querySelectorAll('section[id]')
    
const scrollActive = () =>{
  	const scrollDown = window.scrollY

	sections.forEach(current =>{
		const sectionHeight = current.offsetHeight,
			  sectionTop = current.offsetTop - 58,
			  sectionId = current.getAttribute('id'),
			  sectionsClass = document.querySelector('.nav__menu a[href*=' + sectionId + ']')

		if(scrollDown > sectionTop && scrollDown <= sectionTop + sectionHeight){
			sectionsClass.classList.add('active-link')
		}else{
			sectionsClass.classList.remove('active-link')
		}                                                    
	})
}
window.addEventListener('scroll', scrollActive)

/*=============== SCROLL REVEAL ANIMATION ===============*/
const sr=ScrollReveal({
    origin:'top',
    distance:'60px',
    duration:3000,
    delay:400,
    reset:true,
})

sr.reveal(`.home__data,.explore__data,.explore__user,.footer__container`)
sr.reveal(`.home__card`,{delay:600,distance:'100px',interval:100})
sr.reveal(`.about__data,.join__image`,{origin:'right'})
sr.reveal(`.about__image`,{origin:'left'})
sr.reveal(`.popular__card`,{interval:200})