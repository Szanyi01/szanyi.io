
/* global ScrollReveal */

let sections = document.querySelectorAll('section');
let navLinks = document.querySelectorAll('header nav a');

window.onscroll = () => {
    sections.forEach(sec => {
       let top = window.scrollY;
       let offset=sec.offsetTop - 150;
       let height =sec.offsetHeight;
       let id= sec.getAttribute('id');
       
       if(top >= offset && top < offset+height){
           navLinks.forEach(links => {
               links.classList.remove('active');
              document.querySelector('header nav a [herf*='+ id + ']').classList.add('active'); 
           });
       };
    });
    let header = document.querySelector('header');
    
    header.classList.toggle('sticky',window.scrollY > 100);
};


 

let header = document.querySelector('header');

header.classList.toggle('sticky',window.scrollY > 100);




ScrollReveal({
    // reset: true,
     distance: '80px',
     duration: 2000,
     delay: 200
});

ScrollReveal().reveal('.home-content, .heading', { origin: 'top' });
ScrollReveal().reveal('.home-img, .services-container, .portfolio-box, .contact from', {origin: 'top' });
ScrollReveal().reveal('.home-content h1, .about-img', { origin: 'left' });
ScrollReveal().reveal('.home-content p, .about-content', { origin: 'left' });

const ThisType =new ThisType('.multiple-text',{
    strings: ['Fronted depolper','Youtuber','Blogger'],
    typedSpeed:100,
    backSpeed:100,
    backDelay:1000,
    loop:true
});

const  typed =new typed('.multiple-text',{
    strings: ['Fronted depolper','Youtuber','Blogger'],
    typeSpeed:100,
    backSpeed:100,
    backDelay:1000,
    loop:true
});

var typed = new typed('#multiple-text',{
    strings: ['Fronted depolper','Youtuber','Blogger'],
    typeSpeed:100,
    backSpeed:100,
    backDelay:1000,
    loop:true
});