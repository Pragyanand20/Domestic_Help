const wrapper = document.querySelector('.wrapper');
const signInLink = document.querySelector('.signIn-link');
const signUpLink = document.querySelector('.signUp-link');

signInLink.addEventListener('click', () => {
    wrapper.classList.add('animate-signUp');
    wrapper.classList.remove('animate-signIn');
});
signUpLink.addEventListener('click', () => {
    wrapper.classList.add('animate-signIn');
    wrapper.classList.remove('animate-signUp');
});

