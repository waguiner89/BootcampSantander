class CardNews extends HTMLElement{
    constructor () {
        super();

        const shadow = this.attachShadow({mode: "open"});


        shadow.appendChild(this.build());
        shadow.appendChild(this.styles());
    }

    build (){
        const componentRoot = document.createElement("div");
        componentRoot.setAttribute("class", "card");

        const cardLeft = document.createElement("div");
        cardLeft.setAttribute("class", "card_left");

        const autor = document.createElement("span");
        autor.textContent = "By " + (this.getAttribute ("autor") || "By Anonymous");

        const linkTitle = document.createElement("a");
        linkTitle.textContent = this.getAttribute ("title");
        linkTitle.href = this.getAttribute("link-url");

        const newsContent = document.createElement("p");
        newsContent.textContent = this.getAttribute ("content");

        cardLeft.appendChild(autor);
        cardLeft.appendChild(linkTitle);
        cardLeft.appendChild(newsContent);

        const cardRight = document.createElement("div");
        cardRight.setAttribute("class", "card_right");
        
        const newsImage = document.createElement("img");
        newsImage.src = this.getAttribute("photo") || "assets/img/default.png";
        newsImage.alt = "Imagem de Ben Kenobi";
        cardRight.appendChild(newsImage);

        componentRoot.appendChild(cardLeft);
        componentRoot.appendChild(cardRight);

        return componentRoot;
    }

    styles(){
        const style = document.createElement("style");
        style.textContent = `
            .card {
                box-shadow: 10px 10px 24px 3px rgba(0,0,0,0.75);
                -webkit-box-shadow: 10px 10px 24px 3px rgba(0,0,0,0.75);
                -moz-box-shadow: 10px 10px 24px 3px rgba(0,0,0,0.75);
                display: flex;
                flex-direction: row;
                justify-content: space-between;
                padding: 20px;
            }
            
            .card_left {
                display: flex;
                flex-direction: column;
                justify-content: center;
                padding: 10px;
            }
            
            .card_left span {
                font-weight: 400;
            }
            
            .card_left a {
                margin-top: 15px;
                font-size: 25px;
                font-weight: bold;
                text-decoration: none;
                color: black;
            }
            
            .card_left p {
                color: brown;
            }

            img {
                width: 150px;
                height: 150px;
            }
        `;


        return style;
    }
}

customElements.define("card-news", CardNews);