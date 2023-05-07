let displayBooks = document.querySelector(".displayBooks");
		let button = document.querySelector(".button");
		
		let libraryBookDetails = JSON.parse(localStorage.getItem("bookDetails"))||[];
			let bigDiv = document.createElement("div");
			
			
			for(let i = 0 ; i<libraryBookDetails.length;i++)
			{
				let smallDiv = document.createElement("div");
				
				let authorname = document.createElement("div");
				authorname.innerText ="-" + libraryBookDetails[i].author;
				
				let image = document.createElement("img");
				image.setAttribute("src",libraryBookDetails[i].avatar);
				
				let name = document.createElement("div");
				name.innerText =libraryBookDetails[i].name;
				
				
				let publisher =document.createElement("small");
				publisher.innerText = "(" + libraryBookDetails[i].publisher +")";
				
				
				
				smallDiv.append(name,image,authorname,publisher);
				
				bigDiv.append(smallDiv);
				
				smallDiv.setAttribute("class","smallDiv");
				bigDiv.setAttribute("class","bigDiv");
				smallDiv.setAttribute("onClick",`oneBookData(${i})`);
				console.log(bigDiv);
				authorname.setAttribute("class","authorname");
				name.setAttribute("class","name");
				image.setAttribute("class","image");
				publisher.setAttribute("class","publisher");
				displayBooks.append(bigDiv);
				}
				function oneBookData(i)
				{
					localStorage.setItem("OneBookData",JSON.stringify(libraryBookDetails[i]));
					window.location.href="oneBook.html";
				}
				
			
		
