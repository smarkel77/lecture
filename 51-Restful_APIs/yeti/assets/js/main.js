let reviews = [];
const baseURL = "https://5c98e8f442365600143931a3.mockapi.io/api";

function loadReviews() {
    //let's fetch the data. Good boy.
    fetch(baseURL + "/reviews")
        .then((response) => {
            // get the json out of the response object
            return response.json();
        })
        .then((data) => {
            // add the json to our variable
            reviews = data;
            // load up the reviews
            displayReviews();
        })
        .catch((err) => console.log(err));
}

function deleteReview(id){
    fetch(`${baseURL}/reviews/${id}`,{
        method: 'DELETE',
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify(getReview(id))
      })
      .then((response) => {
        if(response.ok) {
          // the review has been removed from the server but we need to remove it from the local array
          // if you were to refresh the page it would be gone but that isn't very SPA like
          const index = reviews.map(review => review.id).indexOf(id);
          reviews.splice(index,1);
          displayReviews();
        }
      })
      .catch((err) => console.error(err));
}

function editReview(id)
{
    // makes an array of just indexes
    const index = reviews.map(review => review.id).indexOf(id);
    const review = reviews[index];
    const reviewDisplay = document.querySelector('.product-reviews');
    // set the form up
    const saveForm =  document.querySelector('.save-review');
    saveForm.querySelector('.header h2').innerText = review.title;
    document.getElementById('formName').value = review.name;
    document.getElementById('formTitle').value = review.title;
    document.getElementById('review').value = review.review;
    document.getElementById('formReviewID').value = review.id;
    reviewDisplay.classList.add('d-none');
    saveForm.classList.remove('d-none');
}
function saveReview()
{
    const id = document.getElementById('formReviewID').value;

    id == 0 ? createReview() : updateReview(id);
    const reviewDisplay = document.querySelector('.product-reviews');
    const saveForm =  document.querySelector('.save-review');
    reviewDisplay.classList.remove('d-none');
    saveForm.classList.add('d-none');
    resetForm();
}

function createReview()
{
    // make object
    const newReview = {
        name: document.getElementById('formName').value,
        title: document.getElementById('formTitle').value,
        review: document.getElementById('review').value
    };
    fetch(baseURL + "/reviews",{
        method: 'POST',
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify(newReview)
      })
      .then((response) => {
        if(response.ok) {
          loadReviews();
        }
      })
      .catch((err) => console.error(err));

}

function getReview(id)
{
    const index = reviews.map(review => review.id).indexOf(id);
    return reviews[index];
}

function updateReview(id)
{
    // make object from form
    const currentReview = getReview(id);
    currentReview.name = document.getElementById('formName').value;
    currentReview.title = document.getElementById('formTitle').value;
    currentReview.review = document.getElementById('review').value;

    fetch(`${baseURL}/reviews/${id}`,{
        method: 'PUT',
        headers: {
          "Content-Type": "application/json"
        },
        body: JSON.stringify(currentReview)
      })
      .then((response) => {
          if(response.ok){
            loadReviews();
          }
      })
      .catch((err) => console.error(err));
}

function returnToReviews(event)
{
    event.preventDefault();
    const reviewDisplay = document.querySelector('.product-reviews');
    const saveForm =  document.querySelector('.save-review');
    resetForm();
    reviewDisplay.classList.remove('d-none');
    saveForm.classList.add('d-none');

}

function resetForm()
{
    document.getElementById('formName').value = '';
    document.getElementById('formTitle').value = '';
    document.getElementById('review').value = '';

}
function displayReviews() {
    console.log("Display Reviews...");

    if('content' in document.createElement('template')) {
      const container = document.getElementById("review-container");
      // clear the container
      container.innerText = '';
      reviews.forEach((review) => {
        const tmpl = document.getElementById('review-template').content.cloneNode(true);
        tmpl.querySelector('.avatar').src = review.avatar;
        tmpl.querySelector('.review-info h2').innerText = review.title;
        tmpl.querySelector('.review-info span').innerText = review.name + " | " + review.createdAt;
        tmpl.querySelector('.feedback').innerText = review.review;

        const deleteButton = tmpl.querySelector('.delete-review');
        deleteButton.setAttribute('data-id',review.id);
        deleteButton.addEventListener('click',(event) => {
            event.preventDefault();
            deleteReview(event.target.getAttribute('data-id'));
          });

          const editButton = tmpl.querySelector('.edit-review');
          editButton.setAttribute('data-id',review.id);
          editButton.addEventListener('click',(event) => {
              event.preventDefault();
                editReview(event.target.getAttribute('data-id'));
            });

          container.appendChild(tmpl);
      });
    } else {
      console.error('Your browser does not support templates');
    }
  }

  document.addEventListener('DOMContentLoaded',()=>{
    loadReviews();

    const editButton = document.querySelector('.add-review');
    editButton.setAttribute('data-id',"0");
    editButton.addEventListener('click',(event) => {
        event.preventDefault();
        const reviewDisplay = document.querySelector('.product-reviews');
        // set the form up
        const saveForm =  document.querySelector('.save-review');
        reviewDisplay.classList.add('d-none');
        saveForm.classList.remove('d-none');

      });

  });
